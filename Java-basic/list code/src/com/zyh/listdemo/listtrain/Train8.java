package com.zyh.listdemo.listtrain;

import java.util.ArrayList;

public class Train8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phoneInfo = getPhoneInfo(list);
        for (int i = 0; i < phoneInfo.size(); i++) {
            Phone p = phoneInfo.get(i);
            System.out.println(p.getBrand() + "," + p.getPrice());
        }

    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> phone = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int phonePrice = p.getPrice();
            if(phonePrice < 3000){
                phone.add(p);
            }
        }
        return phone;
    }
}
