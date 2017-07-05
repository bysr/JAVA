package com.example;

import org.apache.commons.lang3.ArrayUtils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wangyawen on 2017/7/5 0005.
 * 输入某年某月某日，判断这一天是该年第几天
 */
public class Test14 {


    public static void main(String[] args) {
        System.out.println("输入年月日：");
        Scanner scanner = new Scanner(System.in);

        System.out.println("该日期为本年度的第" + dayCount(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));


    }

    private static int dayCount(int year, int month, int day) {


        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = new int[]{4, 6, 9, 11};


        List<Integer> day_31 = Arrays.asList(ArrayUtils.toObject(a));
        List day_30 = Arrays.asList(ArrayUtils.toObject(b));


        if (year < 0 || month < 0 || day < 0 || month > 12 || day > 31) {
            return -1;
        }

        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");

        System.out.println("输入日期为：" + sdf.format(c.getTime()));

        /*得到年月日*/
        int yy = c.get(Calendar.YEAR);
        int mm = c.get(Calendar.MONTH) + 1;
        int dd = c.get(Calendar.DAY_OF_MONTH);

        int day_sum = 0;
        /*润年判断*/
        if (yy % 4 == 0 && yy % 100 != 0 || 400 == yy % 0) {

            for (int i = 1; i < mm; i++) {

                if (day_31.contains(i)) {
                    day_sum += 31;
                } else if (day_30.contains(i)) {

                    day_sum += 30;
                } else {
                    day_sum += 29;
                }
            }
        } else {

            for (int i = 1; i < mm; i++) {

                if (day_31.contains(i)) {
                    day_sum += 31;
                } else if (day_30.contains(i)) {
                    day_sum += 30;
                } else {
                    day_sum += 28;

                }
            }


        }

        day_sum += dd;

        return day_sum;


    }

}
