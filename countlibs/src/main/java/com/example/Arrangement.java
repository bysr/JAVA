package com.example;

/**
 * Created by wangyawen on 2017/4/6 0006.
 * 1.2.3.4中选取三个数做全排列
 */
public class Arrangement {


    public static void arrange01() {

        int i = 0; // 保存百位上的数
        int j = 0; // 保存十位上的数
        int k = 0; // 保存各位上的数
        int count = 0;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                for (k = 1; k <= 4; k++) {
                    //三个循环，三个数不一致就是啊，
                    if (i != j && j != k && i != k) {
                        System.out.println(++count + ":" + (i * 100 + j * 10 + k));
                    }
                }
            }
        }

    }

    public static void main(String[] args) {

        arrange01();
    }
}



