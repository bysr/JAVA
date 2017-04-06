package com.example;

import java.util.Scanner;

/**
 * Created by wangyawen on 2017/3/31 0031.
 * 分解质因数
 */
public class FenJiePrime {

    public static void main(String[] arg) {

        StringBuffer sb = new StringBuffer();


        Scanner scanner = new Scanner(System.in);

        int prime = scanner.nextInt();

        int b = (int) Math.sqrt(prime);

        sb.append(prime + "=");
        for (int i = 2; i <= prime; i++) {


            if (prime % i == 0) {
                sb.append(i);
                prime = prime / i;
//                之前的写法，从2开始重新整除，貌似没有必要，如果从2开始整除，除非2完全除尽，才会开始下一个质数
//                if (i != prime) {
//                    i = 1;
//                } else {
//                    sb.append(i);
//                }
                i--;
                sb.append("*");


            }

        }

        String str = sb.substring(0, sb.length() - 1);
        System.out.println(str);


    }

}
