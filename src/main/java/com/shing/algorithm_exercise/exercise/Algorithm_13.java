package com.shing.algorithm_exercise.exercise;

/**
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 */
public class Algorithm_13 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < 100001; i++) {
            if (isCompSqrt(i + 100) && isCompSqrt(i + 268)) {
                n = i;
                break;
            }
        }
        System.out.println("所求的数是：" + n);
    }

    //判断完全平方数
    private static boolean isCompSqrt(int n) {
        boolean isCompSqrt = false;
        for (int i = 1; i < Math.sqrt(n) + 1; i++) {
            if (n == Math.pow(i, 2)) {
                isCompSqrt = true;
                break;
            }
        }
        return isCompSqrt;
    }

    /*运行结果
    所求的数是：21
    */
}
