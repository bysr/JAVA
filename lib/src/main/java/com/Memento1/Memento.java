package com.Memento1;

/**
 * Created by wangyawen on 2017/1/24 0024.
 */
public class Memento {
    //备忘录角色，用于存储当前的状态

    private String state = "";


    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
