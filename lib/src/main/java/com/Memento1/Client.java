package com.Memento1;

/**
 * Created by wangyawen on 2017/2/6 0006.
 */
public class Client {


    public static void main(String[] args) {
        /**创建发起人角色，里面有新创建的备忘录对象*/
        Originator o = new Originator();
        /**负责人对象，不修改查看备忘录对象的内容*/
        Caretaker c = new Caretaker();

        //改变负责人对象的状态
        o.setState("On");

        System.out.println("========>1==>" + o.getState());

        //创建备忘录对象，并且将发起人对象的状态保存下来
        c.saveMemento(o.creatMemento());

        //修改发起人的状态

        o.setState("Off");

        System.out.println("=========>2==>" + o.getState());


        o.restoreMemento(c.retrieveMemento());

        System.out.println("=========>3==>" + o.getState());


    }


}
