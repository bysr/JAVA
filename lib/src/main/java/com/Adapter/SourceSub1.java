package com.Adapter;

/**
 * Created by wangyawen on 2017/1/17 0017.
 */
public class SourceSub1 extends Wrapper2{

    @Override
    public void method1() {
        super.method1();


        System.out.println("the sourceable interface's first Sub1!");
    }
}
