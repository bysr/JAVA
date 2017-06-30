package com.example;

import java.util.Scanner;

/**
 * Created by wangyawen on 2017/6/30 0030.
 * 求s=a+aa+aaa+aaaa+aa...a的值,比如：2+22,3+33+333,4+44+444+4444
 */
public class NumAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        numAdd(n);


    }

    private static void numAdd(int n) {

        int result = 0;

        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= n; i++) {
            result =  (result + conversion(n, i));

            sb.append(conversion(n, i) + "+");

        }

        sb.insert(0, result + "=");

        String ss = sb.substring(0, sb.length() - 1);
        System.out.println(ss);

    }


    /**
     * @param n 数字
     * @param i 叠加数量
     * @return 返回一个叠数，比如22,222等
     */
    private static int conversion(int n, int i) {

        String s = "";
        for (int j = 1; j <= i; j++) {
            s += n + "";
        }
        return Integer.valueOf(s);
    }


}
