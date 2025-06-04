package com.zyh.train;

import java.util.Random;

public class Train9 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();
        int sum = 0;
        int average = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;

        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("所有数据的和为：" + sum);
        average = sum / arr.length;
        System.out.println("所有数据的平均数为：" + average);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average){
                count++;
            }
        }
        System.out.println("有" + count + "个数据比平均数小");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
