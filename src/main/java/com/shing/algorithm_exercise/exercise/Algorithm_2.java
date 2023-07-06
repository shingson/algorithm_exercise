package com.shing.algorithm_exercise.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 *判断101-200之间有多少个素数，并输出所有素数
 */
public class Algorithm_2 {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        for (int i = 101; i <= 200; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                res.add(i);
            }
        }
        System.out.println("共有" + res.size() + "个素数");
        for (Integer integer : res) {
            System.out.print(integer + " ");
        }
    }

}
