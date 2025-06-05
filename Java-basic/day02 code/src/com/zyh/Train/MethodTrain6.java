package com.zyh.Train;

public class MethodTrain6 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,7,8,9};

        int[] copyArr = arrayCopy(arr,3,8);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + ",");
        }

    }

    public static int[] arrayCopy(int[] arr,int from, int to){

        int[] copyArr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            copyArr[index] = arr[i];
            index++;
        }

        return copyArr;
    }
}
