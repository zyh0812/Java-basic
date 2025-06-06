package com.zyh.Train;

import java.util.Scanner;

public class MethodTrain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的密码：");
        int password = sc.nextInt();
        int[] passwordArr = getArr(password);
        int[] passwordArr1 = step1(passwordArr);
        int[] passwordArr2 = step2(passwordArr1);
        int[] finalArr = step3(passwordArr2);

        int finalPassword = finalstep(finalArr);
        System.out.println("加密后的密码为：" + finalPassword);

    }
//将密码拆分为单个元素存进数组
    public static int[] getArr(int password){
        int count = 0;
        int rePasswrd = password;
        while(password != 0){
            password = password / 10;
            count++;
        }
        int[] passwordArr = new int[count];

        for (int i = count - 1; i >=0 ; i--) {
            int ge = rePasswrd % 10;
            passwordArr[i] = ge;
            rePasswrd =  rePasswrd / 10;
        }
        return passwordArr;
    }

    //将数组的每个元素+5
    public static int[] step1(int[] passwordArr){
        for (int i = 0; i < passwordArr.length; i++) {
            passwordArr[i] = passwordArr[i] + 5;
        }
        return passwordArr;

    }
//将数组的每个元素对10求余
    public static int[] step2(int[] passwordArr1){
        for (int i = 0; i < passwordArr1.length; i++) {
            passwordArr1[i] = passwordArr1[i] % 10;
        }
        return passwordArr1;
    }

    //将所有数字反转
    public static int[] step3(int[] passwordArr2){
        for (int i = 0,j = (passwordArr2.length-1); i < j; i++,j--) {
            int temp = passwordArr2[i];
            passwordArr2[i] = passwordArr2[j];
            passwordArr2[j] = temp;
        }
        return passwordArr2;
    }

    //将数组里的元素进行拼接，完成加密操作
    public static int finalstep(int[] finalArr){
        int password = 0;
        for (int i = 0; i < finalArr.length; i++) {
            password = password * 10 + finalArr[i];
        }
        return password;
    }
}
