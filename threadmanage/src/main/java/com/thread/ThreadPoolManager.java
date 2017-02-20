package com.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangyawen on 2017/2/17 0017.
 * 线程池管理
 */
public class ThreadPoolManager {

    private static ThreadPoolManager tp = new ThreadPoolManager();
    //线程池维护线程的最少数量
    private final static int CORE_POOL_SIZE = 4;

    //线程池维护线程的最大数量
    private final static int MAX_POOL_SIZE = 10;

    //线程池维护线程所允许的空闲时间
    private final static int KEEP_ALIVE_TIME = 0;

    //线程池所使用的缓冲队列大小
    private final static int WORK_QUEUE_SIZE = 10;


    //消息缓冲队列
    Queue<String> msgQueue = new LinkedList<>();


    private ThreadPoolManager() {
    }


    public static ThreadPoolManager getInstance() {
        return tp;

    }


    private boolean hasMoreAcquire() {
        return !msgQueue.isEmpty();
    }


    //将消息添加到线程

    public void addLogMsg(String msg) {
        Runnable task = new AccessDBThread(msg);

        //将线程加入池中
        threadPoolExecutor.execute(task);


    }

    //访问消息缓存和调度线程
    //查看是否有待定请求，如果有创建一个新的AccessDBThread,并且添加到线程池中
    final Runnable accessBufferThread = new Runnable() {
        @Override
        public void run() {
            if (hasMoreAcquire()) {

                String msg = msgQueue.poll();
                Runnable task = new AccessDBThread(msg);
                threadPoolExecutor.execute(task);
            }


        }
    };

    /**
     * 这个handle用于展示消息队列中的信息
     */
    final RejectedExecutionHandler handler = new RejectedExecutionHandler() {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

            System.out.println(((AccessDBThread) r).getMsg() + "消息放在队列中重新等待执行");
            msgQueue.offer(((AccessDBThread) r).getMsg());
        }
    };

    /**
     * corePoolSize： 线程池维护线程的最少数量
     * maximumPoolSize：线程池维护线程的最大数量
     * keepAliveTime： 线程池维护线程所允许的空闲时间
     * unit： 线程池维护线程所允许的空闲时间的单位
     * workQueue： 线程池所使用的缓冲队列
     * handler： 线程池对拒绝任务的处理策略
     * 管理数据库访问的线程池
     */
    final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME
            , TimeUnit.SECONDS, new ArrayBlockingQueue<>(WORK_QUEUE_SIZE), handler);

    /**
     * 调度线程池
     * 如果任务超过当前线程池的大小，任务会在队列中等待执行
     */
    final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(100);


    /**
     * 定时触发任务
     * 和调度池同步使用，设置从现在开始，每隔一秒执行一次
     */
    final ScheduledFuture taskHandler = scheduler.scheduleAtFixedRate(accessBufferThread, 0, 1, TimeUnit.SECONDS);


}
