package com.shing.algorithm_exercise.exercise;

/**
 * 对10个数进行排序
 */
public class Algorithm_28 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 0, 2, 4, 6, 8};
        //排序前
        System.out.println("排序前");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(" " + arr[k]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        //排序后
        System.out.println("排序后");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(" " + arr[k]);
        }

    }
}
