package com.zyh.test;

public class StrTrain {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "bcda";

        System.out.println(flag(strA,strB));

    }

    public static String changeStr(String strA){
        String strStar = strA.substring(0,1);
        String strEnd= strA.substring(1);
        String newStr = strEnd + strStar;
        return newStr;
    }

    public static boolean flag(String strA,String strB){
        String newStrA;
        for (int i = 0; i < strA.length(); i++) {
            newStrA = changeStr(strA);
            if(newStrA.equals(strB)){
                return true;
            }
        }
        return false;

    }
}
