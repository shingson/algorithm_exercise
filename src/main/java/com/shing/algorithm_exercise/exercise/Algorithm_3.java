package com.shing.algorithm_exercise.exercise;


/**
 *打印出100-999所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 */
public class Algorithm_3 {
    public static void main(String[] args) {
        System.out.println("100-999之间的水仙花数有：");
        for (int i = 100; i <= 999; i++) {
            //提取个位
            int ge = i % 10;
            //提取十位
            int shi = (i / 10) % 10;
            //提取百位
            int bai = i / 100;
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                System.out.print(i + " ");
            }
        }
    }

}
