package com.zyh.train;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role();
        Role r2 = new Role();

        r1.setName("亚索");
        r2.setName("劫");

        r1.setBlood(100);
        r2.setBlood(100);

        while(true){
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r2.getName() + "输掉了这场战斗");
                break;
            }

            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r1.getName() + "输掉了这场比赛");
                break;
            }

        }
    }
}
