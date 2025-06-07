package com.zyh.train;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role){
        Random r = new Random();
        int hurt = r.nextInt(30) + 1;

        int remainBlood = role.blood - hurt;
        remainBlood =  remainBlood < 0 ? 0 : remainBlood;

        role.setBlood(remainBlood);

        System.out.println(this.name + "使用平A攻击了"+ role.name +",造成了" + hurt +"点伤害,劫还剩"+ remainBlood + "点血");

    }
}
