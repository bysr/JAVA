package com.Adapter;

/**
 * Created by wangyawen on 2017/1/17 0017.
 */
public class SourceSub2 extends Wrapper2 {


    @Override
    public void method2() {
        super.method2();

        System.out.println("the sourceable interface's first Sub2!");
    }
}
