package com.zyh.Train;

import java.util.Random;

public class MethodTrain12 {
    public static void main(String[] args) {
        //定义一个数组储存5个数字
        //随机生成五个索引
        //进行抽奖
        int[] arr = {5,588,888,1000,10000};
        int[] newArr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int randomIndex = r.nextInt(arr.length);
            int price = arr[randomIndex];
            if(contains(newArr,price)){
                continue;
            }else{
                newArr[i] = price;
                i++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }


    }

    public static boolean contains(int[] arr,int price){
        for (int i = 0; i < arr.length; i++) {
            if(price == arr[i]){
                return true;
            }
        }
        return false;
    }
}
