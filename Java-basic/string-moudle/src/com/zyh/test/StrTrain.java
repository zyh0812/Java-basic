package com.zyh.test;

public class StrTrain {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";

        System.out.println(flag(strA,strB));

    }

    public static String changeStr(String strA){
        char strStar = strA.charAt(0);
        String strEnd= strA.substring(1);
        String newStr = strEnd + strStar;
        return newStr;
    }

    public static boolean flag(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = changeStr(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;

    }
}
