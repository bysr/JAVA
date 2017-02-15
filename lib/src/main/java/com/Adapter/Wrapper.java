package com.Adapter;

/**
 * Created by wangyawen on 2017/1/17 0017.
 */
public class Wrapper implements Targetable {


    private Adaptation adaptation;


    public Wrapper(Adaptation adaptation) {
        this.adaptation = adaptation;
    }

    @Override
    public void Funcation() {
        /**该处直接引用*/
        adaptation.Funcation();

    }

    @Override
    public void NewFuncation() {
        System.out.println("这是新的适配");

    }
}
