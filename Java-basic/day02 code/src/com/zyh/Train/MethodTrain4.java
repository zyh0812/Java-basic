package com.zyh.Train;

public class MethodTrain4 {
    public static void main(String[] args) {

        int sum1 = getSum(10,20,30);
        int sum2 = getSum(20,20,30);
        int sum = sum1 + sum2;
        System.out.println(sum);

    }

    public static int getSum(int sum1, int sum2, int sum3){
        int result = sum1 + sum2 + sum3;
        return result;
    }
}
