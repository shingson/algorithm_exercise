package com.shing.algorithm_exercise.exercise;

/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Algorithm_10 {
    public static void main(String[] args) {
        distance(100, 10);
    }

    //小球从h高度落下，经过n次反弹后经过的距离和反弹的高度
    private static void distance(double h, double n) {
        double length = 0;
        for (int i = 0; i < n; i++) {
            length += h;
            h /= 2.0;
        }
        System.out.println("经过第" + n + "次反弹后，小球共经过" + length + "米，" + "第" + n + "次反弹的高度为" + h + "米");
    }
}
