package com.shing.algorithm_exercise.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *请将一个正整数n分解质因数，从小到大的顺序返回其质因子。
 */
public class Algorithm_4 {
    public static void main(String[] args) {
        int[] res = primeFactorization(100);
        System.out.println(Arrays.toString(res));
    }
    public static int[] primeFactorization (int n) {
        // write code here
        List<Integer> res = new ArrayList<>();
        int temp = n;
        for(int i = 2; i <= temp; i++){
            if(temp % i == 0){
                temp = temp / i;
                res.add(i);
                i = 1;
            }
        }
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }

}
