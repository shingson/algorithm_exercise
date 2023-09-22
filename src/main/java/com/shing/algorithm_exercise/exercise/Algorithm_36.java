package com.shing.algorithm_exercise.exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 * 分析:比如有4个数n=4;
 * 1 2 3 4
 * 各个数向后移动2位m=2，变为
 * 1 2 3 4
 * 将最后m个数，即将最后2个数变成前面的2个数变为
 * 3 4 1 2
 */
public class Algorithm_36 {
    public static void main(String[] args) {
        //获取用户输入数据
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入想要输入的整数个数n：");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("请依次输入这n个整数：");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("请输入想要移动的位数m：");
        int m = scan.nextInt();
        scan.close();
        //输出原始数据
        System.out.println("输入的数组是：" + Arrays.toString(arr));
        arr.toString();
        //调用函数输出移动后的数组
        System.out.println("移动位置之后的数组是：" + move(arr, n, m));
    }

    //编写函数实现题目移动位置功能
    public static String move(int[] arr, int n, int m) {
        //新建一个数组拷贝原来的数组，使原来的数组长度+m
        int[] arr2 = new int[arr.length + m];
        for (int j = 0; j < arr2.length - m; j++) {//从数组的m位开始，将原来的数组拷贝到新数组中
            if (j < m) {
                arr2[j] = arr[n - m + j];//将数组的后几位要移动的数字放在新数组的前面
            } else {
                arr2[j] = arr[j - m];//将数组的剩下的位数放近新数组中
            }
        }
        //将移动位置之后的新数组的元素拷贝至原数组中
        for (int t = 0; t < n; t++) {
            arr[t] = arr2[t];
        }
        return Arrays.toString(arr);

    }
}
