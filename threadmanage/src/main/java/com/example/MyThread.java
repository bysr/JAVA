package com.example;

/**
 * Created by wangyawen on 2017/2/17 0017.
 */
public class MyThread extends Thread {


    @Override
    public void run() {
        super.run();

        System.out.println(Thread.currentThread().getName() + "正在执行。。。");

    }
}
