package com.shing.algorithm_exercise.exercise;

/**
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 * 分析：请抓住分子与分母的变化规律。
 * 三个连续分数之间的规律是：上两个分子之和等于第三个分数的分子，上两个分母之和等于第三个分数的分母
 */
public class Algorithm_20 {
    public static void main(String[] args) {
        double n1 = 1;
        double n2 = 1;
        double fraction = n1 / n2;
        double Sn = 0;
        for (int i = 0; i < 20; i++) {//Sn累加20次
            double t1 = n1;
            double t2 = n2;
            n1 = t1 + t2;//下一个分数的分子等于上一个分数的分子和分母之和
            n2 = t1;//下一个分数的分母等于上一个分数的分子
            fraction = n1 / n2;//下一个分数
            Sn += fraction;
        }
        System.out.print(Sn);
    }
}
