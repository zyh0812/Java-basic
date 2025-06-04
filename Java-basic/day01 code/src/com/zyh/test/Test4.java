package com.zyh.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高：");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高");
        int height3 = sc.nextInt();

        int result1 = height1 > height2 ? height1 :height2;
        int result2 = result1 > height3 ? result1 : height3;
        System.out.println(result2);

    }
}
