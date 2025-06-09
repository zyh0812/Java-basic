package com.zyh.test;

public class Test1 {
    public static void main(String[] args) {
        String phone = "15083842214";

        String start = phone.substring(0,3);

        String end = phone.substring(7);

        String newPhone = start + "****" + end;

        System.out.println(newPhone);
    }
}
