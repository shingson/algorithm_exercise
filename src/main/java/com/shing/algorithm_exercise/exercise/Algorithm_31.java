package com.shing.algorithm_exercise.exercise;

/**
 * 将一个数组逆序输出。
 */
public class Algorithm_31 {
    public static void main(String[] args) {
        //遍历原始数组
        System.out.println("遍历原始数组为：");
        int[] array = {1, 2, 3, 4, 5};
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();//换行
        //遍历逆序数组
        System.out.println("逆序后的数组为：");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
