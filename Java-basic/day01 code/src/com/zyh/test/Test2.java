package com.zyh.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦度：");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象的时髦度：");
        int girlFashion = sc.nextInt();

        boolean a = myFashion > girlFashion;
        System.out.println(a);
    }
}
