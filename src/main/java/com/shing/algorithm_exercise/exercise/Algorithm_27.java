package com.shing.algorithm_exercise.exercise;

/**
 * 求100之内的素数
 */
public class Algorithm_27 {
    public static void main(String[] args) {
        System.out.println("100以内的素数有：");
        for (int n = 2; n <= 100; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i <= (n + 1) / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
