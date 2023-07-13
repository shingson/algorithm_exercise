package com.shing.algorithm_exercise.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *利用三元运算符来完成此题：从键盘录入一个整型的分数，没有负分
 * 满分为100分，学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 */
public class Algorithm_5 {
    public static void main(String[] args) {
        System.out.println("请输入分数：");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        String res = input >= 90 ? "A" : (input >= 60 ? "B" : "C");
        System.out.println(res);
    }

}
