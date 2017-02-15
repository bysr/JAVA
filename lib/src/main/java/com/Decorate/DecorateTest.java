package com.Decorate;

/**
 * Created by wangyawen on 2017/1/17 0017.
 */
public class DecorateTest {

    public static void main(String[] arg0) {

        /*拿到具体的实现类*/
        IthirdParty ithirdParty = new ThirdParty();
        /*第一次装饰*/
        IthirdParty decorate1 = new Decorator1(ithirdParty);
        IthirdParty decorate2 = new Decorator2(decorate1);

        System.out.print(decorate2.sayMsg());


    }

}
