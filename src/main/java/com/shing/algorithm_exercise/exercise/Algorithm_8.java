package com.shing.algorithm_exercise.exercise;

import java.util.Scanner;

/**
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
 * 几个数相加有键盘控制。
 */
public class Algorithm_8 {
    public static void main(String[] args) {
        long res = no8(2, 5);
        System.out.print("="+res);
    }
    public static long no8(int a,int n) {
        //每个加数
        long num1 = a;
        //和
        long sum = 0;
        //循环加
        for(int i = 0;i < n;i++) {
            if (i < n-1){
                System.out.print(num1 + "+");
            }else{
                System.out.print(num1);
            }
            sum += num1;
            //改变加数
            num1 *= 10;
            num1 += a;
        }
        return sum;
    }

}
