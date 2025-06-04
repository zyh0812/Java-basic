package com.zyh.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个老虎的体重");;
        int tiger1 = sc.nextInt();
        System.out.println("请输入第二个老虎的体重");
        int tiger2 = sc.nextInt();

        int result = tiger1 > tiger2 ? tiger1:tiger2;
        System.out.println(result);
    }
}
