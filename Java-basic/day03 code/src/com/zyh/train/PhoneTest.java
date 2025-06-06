package com.zyh.train;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.brand = "华为";
        p1.price = 3999.9;

        System.out.println(p1.brand);
        System.out.println(p1.price);
        p1.call();
        p1.playGame();

        Phone p2 = new Phone();
        p2.brand = "小米";
        p2.price = 2399;




    }
}
