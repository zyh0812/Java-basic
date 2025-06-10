package com.zyh.test;

public class StrTrain1 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "abcde";

        System.out.println(flag(strA,strB));

    }
    public static String changeStr(String strA){
        char[] c = strA.toCharArray();
        char first = c[0];

        for (int i = 1; i < strA.length(); i++) {
            c[i-1] = c[i];
        }
        c[strA.length()-1] = first;
        String newStr = "";
        for (int i = 0; i < strA.length(); i++) {
            newStr = newStr + c[i];
        }
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
