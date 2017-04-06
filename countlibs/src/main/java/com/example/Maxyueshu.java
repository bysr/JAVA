package com.example;

/**
 * Created by wangyawen on 2017/4/6 0006.
 * 最大公约数和最小公倍数
 * 分析：公约数的求解方式
 * 1.辗转相除法
 * 2.相减法
 * 分析：最小公倍数的求解方式
 * 最小公倍数=A*B /最大公约数、
 * 不明白可以通过手动看，本人就是
 */
public class Maxyueshu {


    /**
     * 辗转相除法
     * 有两个整数 a和 b；
     * 1.a%b=c; 得到余数c
     * 2.如果c=0;很明显 b就是最大公约数
     * 3.若干c!=0; 将b的值赋给a，c的值赋给b，继续执行步骤1，即：a=b,b=c;
     *
     * @param a
     * @param b
     * @return 最大公约数
     */
    public static int Method1(int a, int b) {

        /*之前看网上有一个小伙伴判断了一下a和b的大小，如下*/
       /*   if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }*/
        /*其实完全没有必要，你如果想一下就知道，如果a<b,第一步取余数之后，两个数会后通过变量c置换，上面一步显得多余了*/

        int c = a % b;
        if (c == 0)
            return b;
        else {
            a = b;
            b = c;
            return Method1(a, b);
        }
    }

    /**
     * 相减法
     * 1 A>B,则 A=A-B，B还是B；
     * 2 A<B，则B=B-A，A还是A；
     * 3,A=B，则B是最大公约数
     *
     * @param a
     * @param b
     * @return 最大公约数
     */
    public static int Method2(int a, int b) {

        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        //a>b
        a -= b;
        if (a == b)
            return a;
        else
            return Method2(a, b);


    }


    /**
     * 获取最小公倍数
     */
    public static int Minbeishu(int a, int b) {

        return (a * b) / Method1(a, b);

    }

    public static void main(String[] arg) {

        System.out.println("最大公约数: " + Method2(5, 15));
        System.out.println("最小公倍数: " + Minbeishu(5, 15));

    }


}
