package com.Decorate1;

/**
 * Created by wangyawen on 2017/1/17 0017.
 */
public class CheapCloth extends PersonCloth {
    public CheapCloth(Person person) {
        super(person);
    }

    private void dressShorts() {

        System.out.println("穿条短裤");
    }

    @Override
    public void dressed() {
        // TODO Auto-generated method stub
        super.dressed();
        dressShorts();
    }

}
