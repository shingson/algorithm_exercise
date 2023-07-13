package com.shing.algorithm_exercise.exercise;

import java.util.Scanner;

/**
 *输入两个正整数m和n，求其最大公约数和最小公倍数。
 */
public class Algorithm_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int maxCommon = maxCommon(m, n);
        int minCommon = m * n / maxCommon;
        System.out.println(m + " " + n + "最大公约数=" + maxCommon);
        System.out.println(m + " " + n + "最小公倍数=" + minCommon);
    }

    public static int maxCommon(int m, int n){
        if (n == 0){
            return m;
        }
        return maxCommon(n, m%n);
    }
}
