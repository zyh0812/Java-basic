package com.zyh.train;

import java.util.Scanner;

public class Train5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (i * i == num){
                System.out.println(i + "是它的平方根");
                break;
            }else if(i * i > num){
                System.out.println((i-1) + "是它平方根的整数部分");
                break;
            }

        }
    }
}
