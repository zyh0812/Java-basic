package com.zyh.listdemo.listtrain;

import java.util.ArrayList;

public class Train7 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User user1 = new User(1,"张三","12345");
        User user2 = new User(2,"李四","23455");
        User user3 = new User(3,"王五","23452");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        System.out.println(getInfo(list,2));

    }
    public static int getInfo(ArrayList<User> list, int id){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getId() == id){
                return i;
            }
        }
        return -1;
    }
}
