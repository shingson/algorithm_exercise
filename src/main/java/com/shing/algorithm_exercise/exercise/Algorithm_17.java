package com.shing.algorithm_exercise.exercise;

/**
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 * 假设：第九天还有x个桃，第十天就还有(x/2)-1个桃；若设第十天还有m个桃，
 * 则满足等式(x/2)-1=m反推第九天还有(m+1)*2个桃
 */
public class Algorithm_17 {
    public static void main(String[] args) {
        //第十天还剩1个桃
        int m = 1;
        //不包括第十次，所以只需要循环9次
        for (int i = 9; i > 0; i--) {
            m = (m + 1) * 2;
        }
        System.out.println("小猴子共摘了" + m + "桃子");
    }
}
