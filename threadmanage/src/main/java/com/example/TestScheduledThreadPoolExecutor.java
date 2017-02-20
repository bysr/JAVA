package com.example;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangyawen on 2017/2/17 0017.
 */
public class TestScheduledThreadPoolExecutor {
    public static void main(String[] arg) {

        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                System.out.println("==================");


            }
        }, 1000, 5000, TimeUnit.MILLISECONDS);


        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                System.out.println(System.nanoTime());


            }
        }, 1000, 2000, TimeUnit.MILLISECONDS);


    }


}
