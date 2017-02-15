package com.Memento1;

/**
 * Created by wangyawen on 2017/1/24 0024.
 */
public class Originator {
    //发起人角色，1.记录当前自身的内部状态

    private String state = "";


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    //2.负责恢复和创建备忘录数据
    //保存数据，也即创建数据
    public Memento creatMemento() {
        return new Memento(this.state);
    }

    //获取上次数据

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println("当前状态：" + this.state);

    }


}
