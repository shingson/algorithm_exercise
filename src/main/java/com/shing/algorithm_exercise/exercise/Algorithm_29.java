package com.shing.algorithm_exercise.exercise;

/**
 * 求一个3*3矩阵对角线元素之和
 */
public class Algorithm_29 {
    public static void main(String[] args) {
        int sum = 0;
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
