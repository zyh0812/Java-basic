package com.zyh.listdemo.listtrain;

import java.util.ArrayList;

public class Train1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("您点赞了吗");
        list.add("我是爹");
        list.add("我是爷");
        list.add("我是肖崎超的爹");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}
