package com.zyh.test;

import java.util.Scanner;

public class LuoMaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(true){
            System.out.println("请输入一个数字字符串：");
            str = sc.next();
            if(judgeStr(str)){
                break;
            }else {
                System.out.println("输入的数据有问题，请重新输入");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - 48;
            sb.append(changeStr(c));
        }

        System.out.println(sb);



    }


    public static boolean judgeStr(String str){
        if(str.length() > 9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }

    public static String changeStr(int number){
        String[] luoStr = {"","I"," II"," III"," IV"," V"," VI"," VII"," VIII"," IX"};
        return luoStr[number];
    }


}
