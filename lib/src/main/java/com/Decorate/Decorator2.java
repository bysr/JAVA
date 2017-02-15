package com.Decorate;

/**
 * Created by wangyawen on 2017/1/17 0017.
 */
public class Decorator2 implements IthirdParty {

    IthirdParty ithirdParty;

    public Decorator2(IthirdParty ithirdParty) {
        this.ithirdParty = ithirdParty;
    }


    @Override
    public String sayMsg() {
        return "2=====>" + ithirdParty.sayMsg();
    }
}
