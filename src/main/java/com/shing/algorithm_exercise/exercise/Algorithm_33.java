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
/*
public class YHSJ {
    public static void main(String[] args) {
        //定义了一个长度为10，高度为10的二维数组，数组中的值都为0；
        int[][] arr=new int[10][10];
        for(int i=0;i<arr.length; i++) {
            //由于只是给杨辉三角内的位置赋值，所以是j<=i
            for(int j=0;j<=i;j++) {
                //根据规律，使用if else 赋值
                if(j==0||j==i) {
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
				*/
                    /*由于只是输出杨辉三角范围内的值，所以在内层循环就输出，这种方法不能全部赋值完之后再输出
					"\t"的原因是10和小于10的数组的宽度不同，所以使用\t制表符能使数与数之间距离相等
				*//*

                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}*/
