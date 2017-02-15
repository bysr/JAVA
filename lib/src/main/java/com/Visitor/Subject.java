package com.Visitor;

/**
 * Created by wangyawen on 2017/2/15 0015.
 */
public interface Subject {


    public void accept(Visitor visitor);

    public String getSubject();

}
