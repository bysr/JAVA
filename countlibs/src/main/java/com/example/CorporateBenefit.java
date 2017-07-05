package com.example;

/**
 * Created by wangyawen on 2017/7/5 0005.
 */

import java.util.Scanner;

/**
 * 题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万
 * 元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部
 * 分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可
 * 提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
 */
public class CorporateBenefit {

    private final static long W = 100000;   // 十万

    public static double profit(double n) {

        if (n <= 1 * W) {
            return n * 0.1;
        } else if (n > 1 * W && n <= 2 * W) {
            return (W * 0.1 + (n - W) * 0.075);
        } else if (n > 2 * W && n <= 4 * W) {
            return (W * 0.1 + 1 * W * 0.075 + (n - 2 * W) * 0.05);
        } else if (n > 4 * W && n <= 6 * W) {
            return (W * 0.1 + 1 * W * 0.075 + 2 * W * 0.05 + (n - 4 * W) * 0.03);
        } else if (n > 6 * W && n <= 10 * W) {
            return (W * 0.1 + 1 * W * 0.075 + 2 * W * 0.05 + 2 * W * 0.03 + (n - 6 * W) * 0.015);
        } else if (n > 10 * W) {
            return (W * 0.1 + 1 * W * 0.075 + 2 * W * 0.05 + 2 * W * 0.03 + 4 * W * 0.015 + (n - 10 * W) * 0.01);
        } else {
            return -1;
        }


    }

    public static void main(String[] args) {

        System.out.println("请输入本企业当月利润：");
        Scanner scanner = new Scanner(System.in);
        System.out.println("应发奖金：" + profit(scanner.nextDouble()));

    }


}
