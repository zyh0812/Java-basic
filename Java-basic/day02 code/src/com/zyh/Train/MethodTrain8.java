package com.zyh.Train;

public class MethodTrain8 {
    //求100~100之间有多少个素数
    public static void main(String[] args) {

        int count = 0;


        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for(int j = 2; j < i ;j++){
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i + "为素数");
                count++;
            }else {
                System.out.println(i + "不是素数");
            }

        }

        System.out.println("有" + count + "个素数");


    }
}
