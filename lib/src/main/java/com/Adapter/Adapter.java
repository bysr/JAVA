package com.Adapter;

/**
 * Created by wangyawen on 2017/1/17 0017.
 * 通过继承Adaptation，将Funcation方法扩展到接口方法中
 */
public class Adapter extends Adaptation implements Targetable {
    @Override
    public void NewFuncation() {
        System.out.println("这是新的适配");
    }
}
