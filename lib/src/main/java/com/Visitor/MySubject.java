package com.Visitor;

/**
 * Created by wangyawen on 2017/2/15 0015.
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
