package com.Adapter;

/**
 * Created by wangyawen on 2017/1/17 0017.
 */
public class AdapterTest {


    public static void main(String[] arg0) {


//        Targetable targetable=new Adapter();
//
//        targetable.Funcation();
//        targetable.NewFuncation();

        Adaptation adaptation = new Adaptation();
        Targetable targetable = new Wrapper(adaptation);
        targetable.Funcation();
        targetable.NewFuncation();


    }

}
