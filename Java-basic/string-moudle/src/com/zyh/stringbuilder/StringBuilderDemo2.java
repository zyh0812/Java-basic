package com.zyh.stringbuilder;

import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        String unStr = sb.append(str).reverse().toString();
        System.out.println(unStr);
        if(str.equals(unStr)){
            System.out.println("当前字符串是对称字符串");
        }else {
            System.out.println("当前字符串不是对称字符串");
        }

    }
}
