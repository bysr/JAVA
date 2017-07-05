package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wangyawen on 2017/7/4 0004.
 * 排列组合
 * 1.2.3.4这四个数可以组成多少个不重复的三位数，数学中的计算方法
 * 全排列：A4-3=4！/(4-3)!=24
 * 全组合：C4-3=A4-3/3！=(4*3*2*1)/(3*2*1)=4;
 * 通过程序得到数量以及具体的数
 */
public class Permutations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();
        /*排列位数*/
        int num = scan.nextInt();
        //计算全排列的个数
        String[] in = input.split(";");


        System.out.println("组合：" + arrangement02(in.length, num));
        permutations2(in, num);

        System.out.println("---------------华丽分割线------------------");

        System.out.println("排列数量：" + arrangement01(in.length, num));
        /*显示具体的数*/
        permutations1(in, num);



    }

    /**
     * 组合数量
     *
     * @param length
     * @param num
     * @return
     */
    private static int arrangement02(int length, int num) {
        return (factorial(length)) / (factorial(length - num) * factorial(num));
    }

    /**
     * 全排列数量
     *
     * @param length
     * @param num
     * @return 全排列：A4-3=4！/(4-3)!=24
     */
    private static int arrangement01(int length, int num) {


        return (factorial(length)) / factorial(length - num);
    }

    /**
     * 阶乘计算
     *
     * @param length
     */
    private static int factorial(int length) {

        while (length > 0) {
            return length * factorial(length - 1);
        }

        return 1;
    }

    private static void permutations1(String[] input, int n) {
        if (n > input.length) {

            System.out.println("数量超过限制...");
            return;
        }

        List<String> data = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            data.add(input[i]);
        }

       /*全排列，不限位数*/
//        for (int i = 0; i < input.length; i++) {

        arrangeSelect(data, new ArrayList<>(), n);
//        }


    }

    private static void permutations2(String[] input, int n) {

        if (n > input.length) {

            System.out.println("数量超过限制...");
            return;
        }

        List<String> data = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            data.add(input[i]);
        }


        combinerSelect(data, new ArrayList<>(), n);
    }


    /**
     * 计算A(n,k)
     * 每次递归时，把原始数据和满足条件的工作空间复制一份，所有的操作均在复制文件中进行，目的就是保证不破坏原始数据，
     *
     * @param data   输入的集合对象
     * @param target 数组容器，存储合理的数据集合
     * @param k      排列成n个字符的数据
     */
    public static <E> void arrangeSelect(List<E> data, List<E> target, int k) {
        //临时存储data目录数据
//        j++;
//        System.out.println(j);
        List<E> copyData;
        //已经排列好的数据
        List<E> copyTarget;
        if (target.size() == k) {
            for (E i : target)
                System.out.print(i);
            System.out.println();
        }


        /*1.2.3条数据*/
        for (int i = 0; i < data.size(); i++) {
            copyData = new ArrayList<>(data);
            copyTarget = new ArrayList<>(target);

            copyTarget.add(copyData.get(i));
            copyData.remove(i);
            arrangeSelect(copyData, copyTarget, k);
        }
    }

    private static int i = 0, j = 0;

    /**
     * 步骤：
     * 1.每次递归时，把原始数据和满足条件的工作空间复制一份，所有的操作均在复制文件中进行，目的就是保证不破坏原始数据，从而可以让一轮递归结束后可以正常进行下一轮。
     * 2.其次，把数据的第一个元素添加到工作空间中，判断工作空间的大小，如果小于k,则需要继续递归，但此时，传入递归函数的参数需要注意：假设当前插入的节点的下标是i,
     * 因为是顺序插入的,所以i之前的所有数据都应该舍去，只传入i之后的未使用过的数据。
     * 3.因此在传参之前，应该对copydata作以处理；当大于k的时候，则表明已经找到满足条件的第一种情况，然后只需修改该情况的最后一个结果即可。
     * 如：找到abc时，则只需替换c为d即可完成该轮递归。
     *
     * @param data      原始数据
     * @param workSpace 自定义一个临时空间，用来存储每次符合条件的值
     * @param k         C(n,k)中的k
     */
    public static <E> void combinerSelect(List<E> data, List<E> workSpace, int k) {
//        i++;
//        System.out.println(i);
        List<E> copyData;
        List<E> copyWorkSpace;

        if (workSpace.size() == k) {
            for (Object c : workSpace)
                System.out.print(c);
            System.out.println();
        }

        for (int i = 0; i < data.size(); i++) {
            copyData = new ArrayList<>(data);
            copyWorkSpace = new ArrayList<>(workSpace);

            copyWorkSpace.add(copyData.get(i));
            for (int j = i; j >= 0; j--)
                copyData.remove(j);
            combinerSelect(copyData, copyWorkSpace, k);
        }

    }


}
