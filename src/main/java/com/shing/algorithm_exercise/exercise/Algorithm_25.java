package com.shing.algorithm_exercise.exercise;

import java.util.Random;

/**
 * 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class Algorithm_25 {
    public static void main(String[] args) {
        int i = 12321;
        int j = 12341;
        palin(i);
        palin(j);
    }

    //判断是否为回文数
    public static void palin(int n) {
        int count = 0;
        String s = String.valueOf(n);//将产生的随机数转换成字符串
        char[] c = s.toCharArray();//将字符串转换成字符数组
        for (int a = 0; a <= (c.length - 1); a++) {//将字符数组头尾相互比较
            if (c[c.length - 1 - a] != c[a]) {//如果发现有不相等的不再进行比较，直接打印“不是回文数”并退出循环
                System.out.println(s + "不是回文数");
                break;
            } else {
                count++;
            }
        }
        if (count == c.length) {
            System.out.println(s + "是回文数");
        }
    }
}
