package com.Visitor;

/**
 * Created by wangyawen on 2017/2/15 0015.
 */
public class Test {

    public static void main(String[] args) {


        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();

        subject.accept(visitor);
    }


}
