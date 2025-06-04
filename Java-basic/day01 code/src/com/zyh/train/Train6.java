package com.zyh.train;

import java.util.Scanner;

public class Train6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要测试的数字：");
        int number = sc.nextInt();

        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
//                System.out.println(number+"不是一个质数");
                flag = false;
                break;
            }

        }
        if (flag){
            System.out.println(number+"是一个质数");
        }else {
            System.out.println(number+"不是一个质数");
        }
    }
}
