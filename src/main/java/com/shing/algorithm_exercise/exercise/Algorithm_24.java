package com.shing.algorithm_exercise.exercise;

import java.util.Random;

/**
 * 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class Algorithm_24 {
    public static void main(String[] args) {
        //产生[1,99999]之间的一个正整数n
        Random random = new Random();
        int n = random.nextInt(99999) + 1;//random生成的随机数包头不包尾，所以此处写99999只能产生[0,99999)之间的数，要使得生成[1,99999]的数需要加1
        System.out.println("产生的随机数是：" + n);
        String s = String.valueOf(n);//将产生的随机数转换成字符串
        System.out.println("产生的随机数是：" + s.length() + "位数");
        StringBuffer buffer = new StringBuffer(s);
        System.out.println("逆序打印出来是：" + buffer.reverse());
    }
}
