package com.Decorate1;

/**
 * Created by wangyawen on 2017/1/17 0017.
 */
public class DecorateTest {


    public static void main(String[] arg0) {


        Person person = new Boy();

        PersonCloth cloth = new ExpensiveCloth(person);
        cloth.dressed();
    }

}
