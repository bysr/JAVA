package com.example;

/**
 * Created by wangyawen on 2017/3/31 0031.
 * 判断某个区间的素数
 * 素数定于：只能够被1和本身整除的数
 */
public class PrimeNum {

    public static void isPrime(int m) {

        boolean a = true;
        double b = Math.sqrt(m);

        /*比如16，没有必要从2整除到16，除到平方根位置，会获取所有的结果，
        * 16/1=16
        * 16/2=8
        * 16/3=5
        * 16/4=4
        * 16/5=3,这儿数据已经重复执行，此处没有必要继续执行下去*/

        for (int i = 2; i < b; i++) {
            if (m % i == 0) {
                a = false;
                break;
            }
        }
        if (a) {
            System.out.println("素数一枚：" + m);
        }


    }


    public static void main(String[] arg) {


        double time1 = System.nanoTime();
        System.out.println(time1);
        for (int i = 100; i < 200; i++) {

            isPrime(i);

        }
        double time2 = System.nanoTime();

        System.out.println(time2);
        System.out.println(time2 - time1);
    }

}
