package com.zyh.Train;

public class MethodTrain3 {
    public static void main(String[] args) {
        getLength(1.2 , 2.2);
    }

    public static void getLength(double num1, double num2){
        double result = (num1 + num2) * 2;
        System.out.println(result);
    }
}
