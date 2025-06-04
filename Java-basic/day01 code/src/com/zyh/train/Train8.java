package com.zyh.train;

public class Train8 {
    public static void main(String[] args) {
        int arr[] = {33 , 4 , 22 , 44 ,55};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
