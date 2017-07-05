package com.example;


/**
 * 水仙花：
 * 目的：打印出100-999中的水仙花数
 * 分析：水仙花数=百位立方 + 十位立方  +  个位立方
 */
public class Narcissus {

    public static void main(String[] arg) {
        for (int i = 100; i <= 999; i++) {
            waterFlower(i);

        }
    }

    public static void waterFlower(int m) {
        //百位
        int a = m / 100;
        //个位
        int b = m % 100 / 10;
        //十位
        int c = m % 10 % 10;

        int result = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        if (m == result)
            System.out.println(m);
//            System.out.print("百位=" + a + ",十位=" + b + ",个位=" + c);

    }


}
