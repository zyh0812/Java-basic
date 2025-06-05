package com.zyh.Train;

import java.util.Random;
import java.util.Scanner;

public class MethodTrain10 {
    public static void main(String[] args) {
        //唱歌比赛打分，6个评委，去掉最高分与最低分取平均值。范围为0~100的整数

        int[] scores = new int[6];
        for (int i = 0; i < scores.length; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i+1) + "位评委的分数：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            }else {
                System.out.println("输入分数不合法,请重新输入分数");
            }
        }

        int maxScore = maxScore(scores);
        int minScore = minScore(scores);

        int finalScore = (sumScore(scores)-maxScore-minScore) / (scores.length-2);
        System.out.println("最终分数为：" + finalScore);

    }

    public static int maxScore(int[] scores){
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(max < scores[i]){
                max = scores[i];
            }

        }
        return max;
    }
    public static int minScore(int[] scores){
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(min > scores[i]){
                min = scores[i];
            }

        }
        return min;
    }

    public static int sumScore(int[] scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        return sum;
    }

}
