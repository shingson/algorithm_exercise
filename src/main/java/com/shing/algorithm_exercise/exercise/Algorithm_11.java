package com.shing.algorithm_exercise.exercise;

/**
 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？
 */
public class Algorithm_11 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == j){
                    continue;
                }
                for (int k = 1; k < 5; k++) {
                    if (k != i && k != j) {
                        int n = i * 100 + j * 10 + k;
                        System.out.print(n + " ");
                        count++;
                    }
                }
            }
        }
        System.out.println("符合条件的数共：" + count + "个");
    }
}
