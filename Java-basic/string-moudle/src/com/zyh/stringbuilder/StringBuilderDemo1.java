package com.zyh.stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

//        sb.append(1);
//        sb.append(2.3);
//        sb.append(true);
//        sb.reverse();
//
//        int len = sb.length();
//
//
//
//        System.out.println(len);

//        sb.append("aaa");
//        sb.append("bbb");
//        sb.append("ccc");
//        sb.append("ddd");

        sb.append("aaa").append("bbb").append("ccc").append("ddd");

        System.out.println(sb);

        String str = sb.toString();

        System.out.println(str);
    }
}
