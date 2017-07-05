package com.example;

/**
 * Created by wangyawen on 2017/7/5 0005.
 * 完全平方数，一个数+100是完全平方数，再+168还是完全平方数
 */
public class Test13 {

    public static void main(String[] args) {


        for (int i = 0; i < 1000000; i++) {

            if (Math.sqrt(i + 100) == (int) Math.sqrt(i + 100)) {

                if (Math.sqrt(i + 100 + 168) == (int) Math.sqrt(i + 100 + 168)) {
                    System.out.println(i);
                }
            }

        }


    }

}
