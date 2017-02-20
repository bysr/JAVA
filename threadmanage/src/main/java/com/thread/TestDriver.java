package com.thread;

/**
 * Created by wangyawen on 2017/2/17 0017.
 */
public class TestDriver {


    ThreadPoolManager tp = ThreadPoolManager.getInstance();


    public void sendMsg(String msg) {

        tp.addLogMsg(msg + "记录一条日志");
    }


    public static void main(String[] arg) {

        for (int i = 0; i < 1000; i++) {
            new TestDriver().sendMsg(Integer.toString(i));

        }
    }


}
