package com.zyh.Train;

import java.util.Random;

public class MethodTrain13 {
    public static void main(String[] args) {
        //定义一个数组储存5个数字
        //将元素打乱
        //进行抽奖
        int[] arr = {5, 588, 888, 1000, 10000};
        int[] newArr = unsortedArr(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }



    }
    public static int[] unsortedArr(int[] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return arr;
    }

}
