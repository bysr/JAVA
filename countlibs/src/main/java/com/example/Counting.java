package com.example;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by wangyawen on 2017/4/6 0006.
 * 统计字符串中的 字母、数字、空格、其他字符等
 * 思路：通过正则表达式判断
 */
public class Counting {


    public static void Count(String str) {

        int abcCount = 0;// 英文字母个数
        int spaceCount = 0;// 空格个数
        int numCount = 0;// 数字个数
        int otherCount = 0;// 其他字符个数


        Pattern p1 = Pattern.compile("^[a-zA-Z]+$");/*验证字母*/
        Pattern p2 = Pattern.compile("^[0-9]+$");/*验证数字*/
        Pattern p3 = Pattern.compile("\\s+");/*验证空格*/


        String s = null;


        for (int i = 0; i < str.length(); i++) {

            s = str.substring(i, i + 1);
            if (p1.matcher(s).matches()) {

                abcCount++;
            } else if (p2.matcher(s).matches()) {
                numCount++;
            } else if (p3.matcher(s).matches()) {
                spaceCount++;
            } else
                otherCount++;

        }


        System.out.println("字母个数：" + abcCount);
        System.out.println("数字个数：" + numCount);
        System.out.println("空格个数：" + spaceCount);
        System.out.println("其    他：" + otherCount);

    }


    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        Count(scanner.nextLine());

    }
}
