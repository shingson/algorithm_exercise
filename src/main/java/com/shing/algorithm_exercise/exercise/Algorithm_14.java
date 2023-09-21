package com.shing.algorithm_exercise.exercise;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天？
 */
public class Algorithm_14 {
    public static void main(String[] args) {
        int dijitian = dijitian(2023, 3, 5);
        System.out.println(dijitian);
    }

    //求解天数
    private static int dijitian(int year, int month, int date) {
        int n = 0;
        int[] month_date = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        //判断闰年
        if ((year % 400) == 0 || ((year % 4) == 0) && ((year % 100) != 0))
            month_date[2] = 29;
        for (int i = 0; i < month; i++)
            n += month_date[i];
        return n + date;
    }
}
