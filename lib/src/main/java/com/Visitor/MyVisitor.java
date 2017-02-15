package com.Visitor;

/**
 * Created by wangyawen on 2017/2/15 0015.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {

        System.out.println(sub.getSubject());

    }
}
