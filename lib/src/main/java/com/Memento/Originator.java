package com.Memento;

/**
 * 发起人
 * Created by wangyawen on 2017/1/24 0024.
 */
public class Originator {
//    private String state1 = "";
//    private String state2 = "";
//    private String state3 = "";
//
//
//    public String getState1() {
//        return state1;
//    }
//
//    public void setState1(String state1) {
//        this.state1 = state1;
//    }
//
//    public String getState2() {
//        return state2;
//    }
//
//    public void setState2(String state2) {
//        this.state2 = state2;
//    }
//
//    public String getState3() {
//        return state3;
//    }
//
//    public void setState3(String state3) {
//        this.state3 = state3;
//    }


    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Memento createMemento() {

        return new Memento(BeanUtils.backupProp(this));
    }

    public void restoreMemento(Memento memento) {
        BeanUtils.restoreProp(this, memento.getStateMap());
    }


//    public String toString() {
//        return "state1=" + state1 + "state2=" + state2 + "state3=" + state3;
//    }


    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
