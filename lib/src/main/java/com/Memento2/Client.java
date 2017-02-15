package com.Memento2;

/**
 * Created by wangyawen on 2017/2/10 0010.
 */
public class Client {


    public static void main(String[] arg) {
        /**发起人*/
        Originator o = new Originator();
        /**负责人*/
        Caretaker c = new Caretaker(o);

        //改变发起人的状态
        o.setState("state0");
        //创建一个检查点
        c.createMemento();
        o.setState("state1");
        c.createMemento();
        o.setState("state2");
        c.createMemento();
        o.setState("state3");
        c.createMemento();
        o.setState("state4");
        c.createMemento();
        //打印出所有状态
        o.printStates();

        //恢复到第3个检查点
        System.out.println("Restoring to 3");
        c.reStoreMemento(3);
        o.printStates();
        //恢复到第0个检查点
        System.out.println("Restoring to 0");
        c.reStoreMemento(0);
        o.printStates();
        //恢复到第4个检查点
        System.out.println("Restoring to 4");
        c.reStoreMemento(4);
        o.printStates();
    }


}
