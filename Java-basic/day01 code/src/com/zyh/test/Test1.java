package com.zyh.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入个三位数：");
        int number = sc.nextInt();

        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
