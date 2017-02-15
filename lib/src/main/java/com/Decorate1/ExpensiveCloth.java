package com.Decorate1;

/**
 * Created by wangyawen on 2017/1/17 0017.
 */
public class ExpensiveCloth extends PersonCloth {

    public ExpensiveCloth(Person person) {
        super(person);
        // TODO Auto-generated constructor stub
    }

    private void dressShirt() {
        System.out.println("穿短袖");
    }

    private void dressLeather() {
        System.out.println("穿件皮衣");
    }

    private void dressJean() {

        System.out.println("穿牛仔裤");
    }


    @Override
    public void dressed() {
        // TODO Auto-generated method stub
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();

    }

}
