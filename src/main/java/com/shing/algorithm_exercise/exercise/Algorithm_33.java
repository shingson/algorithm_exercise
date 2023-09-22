package com.shing.algorithm_exercise.exercise;

import java.util.Scanner;

/**
 * 打印出杨辉三角形（要求打印出10行如下图）
 * 分析：
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * ％4d代表在4个空格内打印数字。我们选择4，因为我们知道10行杨辉三角形的最大数字的最大位数是3位数。
 */
public class Algorithm_33 {
    public static void main(String[] args) {
        int rows = 10;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            //打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
