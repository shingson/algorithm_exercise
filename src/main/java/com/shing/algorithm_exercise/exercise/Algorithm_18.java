package com.shing.algorithm_exercise.exercise;

/**
 * 两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。
 * a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
 * 分析：如果是人经过逻辑推理可以很快的得到结论。但是计算机处理此问题，不可能立即得出结论，而必须对每一种组合一一验证，找出符合条件的组合。
 * 假设甲队a,b,c的对手分别是i,j,k i,j,k互不相等并且分别都是乙队x,y,z中的一人
 * 利用三重for循环保证i,j,k互不相等
 * 再将题设条件“a说他不和x比，c说他不和x,z比”转换成if判断语句进行判断，最后输出结果
 */
public class Algorithm_18 {
    public static void main(String[] args) {
        //假设a的对手是i，b的对手是j，c的对手是k
        char i, j, k;
        //i可能是x,y,z中的任意一个，对i进行遍历
        for (i = 'x'; i <= 'z'; i++) {
            //j可能是x,y,z中的任意一个，对j进行遍历
            for (j = 'x'; j <= 'z'; j++) {
                //k可能是x,y,z中的任意一个，对k进行遍历
                for (k = 'x'; k <= 'z'; k++) {
                    //要满足i,j,k互不相等，首先要满足 i!=j其次要满足 i!=k    最后要满足j!=k
                    if (i != j && i != k && j != k) {
                        //a的对手是i,a不与x比，即i!='x'    c的对手是k,c不与x,z比,即k!=‘x’&& k!='z'
                        if (i != 'x' && k != 'x' && k != 'z') {
                            System.out.println("a的对手是" + i + "  b的对手是" + j + "  c的对手是" + k);
                        }
                    }
                }
            }
        }
    }
}
