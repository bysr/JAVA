package com.Memento2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by wangyawen on 2017/2/10 0010.
 */
public class Originator {

    private Vector<Object> states;
    private int index;


    public Originator() {
        states = new Vector<>();
        index = 0;
    }


    public MementoIF createMemento() {
        return new Memento(this.states, index);
    }


    public void restoreMemento(MementoIF memento) {
        states = ((Memento) memento).getStates();
        index = ((Memento) memento).getIndex();


    }


    //状态的赋值方法
    public void setState(Object state) {
        this.states.addElement(state);
        index++;
    }

    //辅助方法，打印出所有状态
    public void printStates() {
        System.out.println("Total number of states:" + index);
        for (Object o : states) {
            System.out.println(o.toString());
        }
    }

    /**
     * 备忘录角色类
     */
    public class Memento implements MementoIF {


        private Vector<Object> saveStates;
        private int saveIndex;


        //_states一定是Vector<Object类型的变量，复制后也一定是Vector<Object的变量
        private Memento(Vector<Object> _states, int _index) {
            //保存客户端传来的状态对象的拷贝，否则客户端的修改会影响到保存的状态。
            saveStates = (Vector<Object>) _states.clone();
            saveIndex = _index;
        }

        private Vector<Object> getStates() {
            return saveStates;
        }

        private int getIndex() {
            return saveIndex;
        }
    }


}



