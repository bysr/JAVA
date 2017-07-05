package com.example;

/**
 * Created by wangyawen on 2017/7/5 0005.
 * 猴子吃桃，猴子摘了N个桃子，第一天吃1/2+1个，第二天吃剩下的1/2+1个，第十天想吃的时候还剩1个，求总共摘了多少个桃子
 */
public class MonkeyPeach {

    public static void main(String[] args) {

        //倒序计算
        TipCount();
        //顺序计算
//        AlongCount();


    }

    private static void AlongCount() {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            int count = Count(i);
            System.out.println("第" + i + "天有" + count + "个桃子");

            sum += count;
        }

        System.out.println(sum);


    }

    /**
     * 某一天的桃子数量
     */
    private static int Count(int day) {
        while (day < 10) {
            return (Count(day + 1) + 1) * 2;
        }
        return 1;


    }


    private static void TipCount() {
        int peach = 1;
        int sun = 0;

        for (int i = 10; i > 0; i--) {
            System.out.println("第" + i + "天剩余" + peach + "个桃子");
            sun += peach;
            peach = (peach + 1) * 2;
        }
        System.out.println(sun);
    }


}
