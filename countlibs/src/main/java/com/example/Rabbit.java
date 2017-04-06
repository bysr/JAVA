package com.example;

/**
 * Created by wangyawen on 2017/3/31 0031.
 * 说明：一对兔子，三个月生一胎，正常的走势这样的
 * <p/>
 * 1；1；2；3；5；8；13;结果上有如下特点：A3=A1+A2
 */
public class Rabbit {

    public static void main(String[] args) {

        for (int i = 1; i < 20; i++) {
            System.out.print(Arrange(i) + ",");
            if (i % 10 == 0)
                System.out.println();
        }


//        Rabbit();
    }

    /*变量控制*/
    private static void Rabbit() {
        int a = 1, b = 1, c;
        for (int i = 1; i < 16; i++) {
            if (i == 1 || i == 2) {
                System.out.print("1,");
                continue;
            }
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + ",");

            if (i % 10 == 0)
                System.out.println();
        }
    }

    /*递归*/
    public static int Arrange(int arg) {

        if (arg == 1 || arg == 2)
            return 1;
        return (Arrange(arg - 1) + Arrange(arg - 2));

    }
}
