package com.shing.algorithm_exercise.exercise;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */
public class Algorithm_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        count(line);
        scanner.close();
    }

    public static void count(String str) {
        char[] array = str.toCharArray();
        int countChinese = 0, countLetter = 0, countSpace = 0, countMath = 0, countElse = 0;
        for (char c : array) {
            String s = String.valueOf(c);
            if (s.matches("[\u4e00-\u9fa5]")) {
                countChinese++;
            } else if (s.matches("[a-zA-Z]")) {
                countLetter++;
            } else if (s.matches("[\\s]")) {
                countSpace++;
            } else if (s.matches("[0-9]")) {
                countMath++;
            } else {
                countElse++;
            }
        }
        System.out.println("输入的汉字个数：" + countChinese);
        System.out.println("输入的字母个数：" + countLetter);
        System.out.println("输入的数字个数：" + countMath);
        System.out.println("输入的空格个数：" + countSpace);
        System.out.println("输入的其他字符个数：" + countElse);
    }
}
