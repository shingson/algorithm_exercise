package com.shing.algorithm_exercise.exercise;

/**
 * 一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
 */
public class Algorithm_9 {
    public static void main(String[] args) {
        no9(1000);
    }
    public static void no9(int n) {
        for(int i = 2;i < n;i++) {
            //判断i是不是完数
            int num = 0;
            for(int j = 1;j <= i/2;j++) {
                //找因子
                if(i % j == 0) {
                    num += j;
                }
            }
            if(i == num) {
                System.out.println("完数有"+i);
            }
        }
    }


}
