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
//        ori.setState1("中国");
//        ori.setState2("强盛");
//        ori.setState3("繁荣");
        ori.setName("王亚文");
        ori.setAge("24");
        System.out.println("===初始化状态===\n" + ori);

        caretaker.setMemMap("001", ori.createMemento());
//        ori.setState1("软件");
//        ori.setState2("架构");
//        ori.setState3("优秀");

        ori.setName("林小妹");
        ori.setAge("99");
        System.out.println("===修改后状态===\n" + ori);

        caretaker.setMemMap("002", ori.createMemento());

//        ori.setState1("学生");
//        ori.setState2("老师");
//        ori.setState3("家长");

        ori.setName("哈哈哈哈");
        ori.setAge("56");
        caretaker.setMemMap("003", ori.createMemento());

        System.out.println("===当前状态值===\n" + ori);

        ori.restoreMemento(caretaker.getMemento("001"));

        System.out.println("===001恢复后状态===\n" + ori);
        ori.restoreMemento(caretaker.getMemento("002"));
        System.out.println("===002恢复后状态===\n" + ori);
        ori.restoreMemento(caretaker.getMemento("003"));
        System.out.println("===003恢复后状态===\n" + ori);
    }

}
