package com.Memento;

/**
 * Created by wangyawen on 2017/1/24 0024.
 */
public class Test {

    public static void main(String[] args) {

        //发起人
        Originator ori = new Originator();
        //管理者
        Caretaker caretaker = new Caretaker();
        ori.setState1("中国");
        ori.setState2("强盛");
        ori.setState3("繁荣");
        System.out.println("===初始化状态===\n" + ori);

        caretaker.setMemMap("001", ori.createMemento());
        ori.setState1("软件");
        ori.setState2("架构");
        ori.setState3("优秀");
        System.out.println("===修改后状态===\n" + ori);

        ori.restoreMemento(caretaker.getMemento("001"));
        System.out.println("===恢复后状态===\n" + ori);
    }

}