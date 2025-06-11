package com.zyh.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list  = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

//        list.remove("ddd");
//        list.remove(0);
//        String str = list.remove(0);
//        System.out.println(str);
////        String result = list.set(1, "ddd");
//        System.out.println(result);
//
//        String s = list.get(0);
//        System.out.println(s);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println(list);

    }
}
