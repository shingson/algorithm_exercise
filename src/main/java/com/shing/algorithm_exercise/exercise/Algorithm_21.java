package com.shing.algorithm_exercise.exercise;

/**
 * 求1+2!+3!+...+20!的和
 */
public class Algorithm_21 {
    public static void main(String[] args) {
        long sum = 0L;
        for (int i = 1; i <= 20; i++) {
            sum += factorial(i);
        }
        System.out.println(sum);
    }

    //递归求阶乘
    public static long factorial(int n) {
        if (n == 0 || n == 1) {//当n==0或者1时，返回0或1的阶乘1
            return 1;
        }
        return n * factorial(n - 1);
    }

    //循环求阶乘
    //		long sum=1;
    //		for(int i=1;i<=n;i++) {
    //			sum*=i;
    //		}
    //		return sum;
}
