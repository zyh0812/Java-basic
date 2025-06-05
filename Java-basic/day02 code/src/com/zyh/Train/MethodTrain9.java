package com.zyh.Train;

import java.util.Random;

public class MethodTrain9 {
    public static void main(String[] args) {
        //生成验证码,前四位为随机大小写字母,最后一位为数字
        //1.定义一个52位的字符数组
        char[] word = new char[52];


        //建立循环将52个大小写字母赋值到数组里
        for (int i = 0; i < word.length; i++) {
            if(i <= 25){
                word[i] = (char)(97 + i);
            }else {
                word[i] = (char)(65 + i - 26);
            }

        }

        //定义一个空的字符串，随机生成四个字母加入到字符串
        String result = "";
        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            int index = r.nextInt(word.length);
            result = result + word[index];
        }


        //随机生成最后一位验证码数字
        Random r = new Random();
        int num = r.nextInt(10);

        result = result + num;
        System.out.println(result);


    }
}
