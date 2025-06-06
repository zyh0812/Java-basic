package com.zyh.Train;

public class MethodTrain15 {
    public static void main(String[] args) {
        int[][] arr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99},
        };
//        int season1 = getSum(arr[0]);
//        int season2 = getSum(arr[1]);
//        int season3 = getSum(arr[2]);
//        int season4 = getSum(arr[3]);
//        System.out.println(season1);
//        System.out.println(season2);
//        System.out.println(season3);
//        System.out.println(season4);
//
//        int sum = season1 + season2 + season3 + season4;
//        System.out.println(sum);

        int finalSum = 0;
        for (int i = 0; i < arr.length; i++) {

            int sum = getSum(arr[i]);
            System.out.println("第" + i + "季度的营业额为：" + sum);
            finalSum += sum;
        }
        System.out.println("全年的营业额为：" + finalSum);

    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
