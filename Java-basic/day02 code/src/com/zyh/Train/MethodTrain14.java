package com.zyh.Train;

import java.util.Random;
import java.util.Scanner;

public class MethodTrain14 {
    public static void main(String[] args) {
        //创建数组用于添加号码
        //6个红球，1一个蓝球 长度为7
        //红球范围1-33  蓝球1-16
        int[] arr = new int[7];

        //生成随机红球
        int[] newArr = redBall(arr);

        //生成随机蓝球
        Random r = new Random();
        int blueBall = r.nextInt(16) + 1;
        newArr[newArr.length-1] = blueBall;
        System.out.println("==========================");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println("==========================");

        //用户输入
        int[] peopleBuy = peopleBuyNumber();

        //判断用户中奖情况
        int redCount = 0;
        int blueCount = 0;
        //判断红球
        for (int i = 0; i < (peopleBuy.length -1); i++) {
            int redNumber = peopleBuy[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if(redNumber == arr[j]){
                    redCount ++;
                    break;
                }
            }
        }
        //判断蓝球
        if(peopleBuy[peopleBuy.length-1] == arr[arr.length-1]){
            blueCount++;
        }
        System.out.println(redCount);
        System.out.println(blueCount);

        //生成中奖情况
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜你，中了一等奖,奖金1000万");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜你，中了二等奖,奖金500万");
        }else if(redCount == 5 && blueCount ==1){
            System.out.println("恭喜你，中了三等奖,奖金3000");
        }else if((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)){
            System.out.println("恭喜你，中了四等奖,奖金200");
        }else if((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)){
            System.out.println("恭喜你，中了五等奖,奖金10");
        }else if((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)){
            System.out.println("恭喜你，中了六等奖,奖金5");
        }else {
            System.out.println("谢谢惠顾");
        }

    }
    //随机生成6个红球数字
    public static int[] redBall(int[] arr){
        Random r = new Random();
        for (int i = 0; i < (arr.length-1); ) {
            int randomNum = r.nextInt(33) + 1;
            if(!(contains(arr,randomNum))){
                arr[i] = randomNum;
                i++;
            }

        }
        return arr;
    }
    //判断红球里是否有重复的数字
    public static boolean contains(int[] arr,int randomNum){
        for (int i = 0; i < (arr.length-1); i++) {
            if(randomNum == arr[i]){
                return true;
            }
        }
        return false;
    }
    //用户输入自己所购买的数字
    public static int[] peopleBuyNumber(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < (arr.length-1); ) {
            System.out.println("请输入第" + (i+1) + "个红球数字");
            int redNumber = sc.nextInt();
            if(redNumber >= 1 && redNumber <=33){
                boolean flag = contains(arr, redNumber);
                if(flag){
                    System.out.println("您已选择当前数字，请重新输入");
                }else {
                    arr[i] = redNumber;
                    i++;
                }
            }else{
                System.out.println("您输入的数字是非法的，请重新输入");
            }
        }

        System.out.println("请输入你要购买的篮球数字");

        while(true){
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 && blueNumber <= 16){
                arr[arr.length-1] = blueNumber;
                break;
            }else {
                System.out.println("您输入的蓝球数字非法，请重新输入");
            }
        }
        return arr;
    }

}
