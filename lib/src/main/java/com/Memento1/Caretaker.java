package com.Memento1;

/**
 * Created by wangyawen on 2017/2/6 0006.
 * 负责人角色类，负责人角色负责保存备忘录对象，但是从不修改（甚至不查看）备忘录对象的内容。
 */
public class Caretaker {

    private Memento memento;

    public Memento retrieveMemento() {
        return memento;
    }


    public void saveMemento(Memento memento) {
        this.memento = memento;

    }


}
