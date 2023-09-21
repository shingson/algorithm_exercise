package com.shing.algorithm_exercise.exercise;

/**
 * 输出9*9口诀。
 */
public class Algorithm_16 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            //换行
            System.out.println();
        }
    }
}
