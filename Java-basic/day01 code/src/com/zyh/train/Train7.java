package com.zyh.train;

import java.util.Random;
import java.util.Scanner;

public class Train7 {
    public static void main(String[] args) {
        Random r = new Random();
        int number =   r.nextInt(100) + 1;

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数字：");
            int guessnumber = sc.nextInt();

            if (number == guessnumber) {
                System.out.println("恭喜你,猜对了");
                break;
            } else if (number > guessnumber) {
                System.out.println("可惜,猜小了");
            } else {
                System.out.println("可惜,猜大了");
            }
        }

    }
}
