package com.zyh.Train;

import java.util.Scanner;

public class MethodTrain7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入飞机票的原价：");
        int ticket = sc.nextInt();
        System.out.println("请输入月份：");
        int mon = sc.nextInt();
        System.out.println("请输入座舱（0：头等舱,1：经济舱）：");
        int sit = sc.nextInt();

        if (mon >= 5 && mon <= 10) {
            ticket = getTicket(ticket, sit, 0.9, 0.85);
        } else if ((mon >= 1 && mon <= 4) || (mon >= 11 && mon <= 12)) {
            ticket = getTicket(ticket, sit, 0.7, 0.65);
        }

        System.out.println("飞机票的价格为：" + ticket);
    }

    private static int getTicket(int ticket, int sit, double v, double v2) {
        if (sit == 0) {
            ticket = (int) (ticket * v);
        } else if (sit == 1) {
            ticket = (int) (ticket * v2);
        }
        return ticket;
    }
}

