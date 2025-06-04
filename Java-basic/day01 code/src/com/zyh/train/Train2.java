package com.zyh.train;

public class Train2 {
    public static void main(String[] args) {
        int num = 1234;
        int num2 = num;
        int temp = 0;
        while(num!=0){
            int ge = num % 10;
            num = num / 10;

            temp = temp * 10 + ge;

        }

        if (temp == num2){
            System.out.println("True");
        }else
            System.out.println("False");

    }
}
