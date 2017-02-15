package com.Memento2;

import java.util.Vector;

/**
 * Created by wangyawen on 2017/2/10 0010.
 * 责任人角色
 */
public class Caretaker {

    private Originator o;
    private Vector<MementoIF> mementos = new Vector<MementoIF>();
    private int currentIndex;

    public Caretaker(Originator o) {
        this.o = o;
        currentIndex = 0;
    }

    //创建一个新的检查点
    public void createMemento() {
        mementos.addElement(o.createMemento());
        currentIndex++;
    }

    //将发起人恢复到某个检查点
    public void reStoreMemento(int index) {
        o.restoreMemento(mementos.elementAt(index));
    }

    //删除某个检查点
    public void removeMemento(int index) {
        mementos.removeElementAt(index);
    }


}
