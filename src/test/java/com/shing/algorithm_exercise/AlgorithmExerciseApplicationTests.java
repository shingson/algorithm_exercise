package com.shing.algorithm_exercise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class AlgorithmExerciseApplicationTests {

    @Test
    void contextLoads() {
        int gcd = gcd(12, 18);
        System.out.println(gcd);
    }
    private int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
