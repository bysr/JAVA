package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangyawen on 2017/2/17 0017.
 */
public class TestSingleThreadExecutor {


    public static void main(String[] arg) {

        /**（单个后台线程），它们均为大多数使用场景预定义了设置*/
        ExecutorService pool1 = Executors.newSingleThreadExecutor();


        /**创建一个可重用固定线程数的线程池*/
        ExecutorService pool2 = Executors.newFixedThreadPool(2);

        /**无界线程池，可以进行自动线程回收,使用之后五个线程同步运行*/
        ExecutorService pool = Executors.newCachedThreadPool();


        //创建实现Runnable接口对象，Thread对象当然也实现了Runnable接口
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();

        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);

        pool.shutdown();


    }

}
