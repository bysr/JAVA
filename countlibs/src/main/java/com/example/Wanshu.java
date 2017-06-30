package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyawen on 2017/6/30 0030.
 * 完数：一个数等于他的因子之和
 */
public class Wanshu {

    public static void main(String[] args) {
        //计算10000以内的完数

        for (int i = 1; i < 10000; i++) {

            WanshuAdd(i);
        }


    }


    /**
     * 完数计算
     *
     * @param n
     */
    private static void WanshuAdd(int n) {

        List<Integer> list = new ArrayList<>();
        //求出所有的因数
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        int result = 0;
        StringBuffer sb = new StringBuffer();

        /*判断因数之和是否等于该数*/
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
            sb.append(list.get(i) + "+");
        }

        if (result == n) {
            sb.insert(0, n + "=");
            String ss = sb.substring(0, sb.length() - 1);
            System.out.println(ss);
        }
    }

}
