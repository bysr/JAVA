package com.example;

import java.util.Scanner;

/**
 * Created by wangyawen on 2017/7/5 0005.
 * 打印菱形图案
 */
public class Test19 {
    public static void main(String[] args) {

        System.out.println("打印菱形：输入三角形的行数：");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        //绘制正三角


        for (int i = 0; i < n; i++) {

            //1.先绘制空格，2.绘制*

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
        //正三角

        //倒三角
        for (int i = n - 1; i > 0; i--) {
            for (int j = i - 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = i * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }


        //打印平行四边形

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print("*");

            }

            System.out.println();


        }





    }

}
