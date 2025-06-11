package com.zyh.listdemo.listtrain;

import java.util.ArrayList;

public class Train3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("张三",24);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",24);
        Student s4 = new Student("老六",24);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
