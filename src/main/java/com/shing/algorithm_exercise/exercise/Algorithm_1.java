package com.shing.algorithm_exercise.exercise;

/**
 *古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子对数为多少？
 */
public class Algorithm_1 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println("共有"+ sum(n) + "对兔子");
    }

    static int sum(int n){
        if(n <= 2) return 1;
        int v1 = 1, v2 = 1;
        for(int i = 3; i <= n; i++){
            int v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
        }
        return v2;
    }
}
