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
        for (int i = 1; i <= n; i++) {
            System.out.println("");
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
        }
        for (int i = n - 1; i > 0; i--) {
            System.out.println("");

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

        }


    }

}
