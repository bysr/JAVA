package com.Decorate;

/**
 * 具体装饰类1，实现一个与抽象构件接口一致的接口
 * Created by wangyawen on 2017/1/17 0017.
 */
public class Decorator1 implements IthirdParty {
    IthirdParty thirdParty;

    /*持有一个构件（Component）对象的实例*/
    public Decorator1(IthirdParty thirdParty) {

        this.thirdParty = thirdParty;

    }

    @Override
    public String sayMsg() {
        return "1===>" + thirdParty.sayMsg();
    }
}
