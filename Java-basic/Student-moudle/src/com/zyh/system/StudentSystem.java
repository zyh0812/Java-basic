package com.zyh.system;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        zyh:while(true){
            System.out.println("-------------------欢迎来到学生系统---------------------");
            System.out.println("1.添加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.查询学生信息");
            System.out.println("5：退出系统");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1":
                    System.out.println("添加学生信息");
                    addStudent(list);
                    break;
                case "2":
                    System.out.println("删除学生信息");
                    deleteStudent(list);
                    break;
                case "3":
                    System.out.println("修改学生信息");
                    updateStudent(list);
                    break;
                case "4":
                    System.out.println("查询学生信息");
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("已退出学生系统");
                    break zyh;
                default:
                    System.out.println("操作输入错误，请重新输入");
                    break;
            }
        }
    }
    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        //录入学号
        while(true){
            System.out.println("添加学号：");
            String id = sc.next();
            boolean flag = contains(list,id);
            if(flag){
                System.out.println("学号已经存在，请重新输入学号");
            }else {
                s.setId(id);
                break;
            }
        }

        //录入姓名
        System.out.println("添加姓名：");
        String name = sc.next();
        s.setName(name);

        //录入年龄
        System.out.println("添加年龄：");
        int age = sc.nextInt();
        s.setAge(age);

        //录入家庭住址
        System.out.println("添加家庭住址：");
        String home = sc.next();
        s.setHome(home);
        list.add(s);
        System.out.println("学生信息添加成功");

    }
    public static void deleteStudent(ArrayList<Student> list){

        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list,id);
        if(index == -1){
            System.out.println("学号不存在");
            return;
        }
        list.remove(index);

        System.out.println("id为" + id + "的学生信息删除成功");
    }

    public static void updateStudent(ArrayList<Student> list){
        System.out.println("请输入要修改学生的学号：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list,id);

        if(index == -1){
            System.out.println("学号不存在");
            return;
        }

        Student stu = list.get(index);

        System.out.println("请输入修改后的姓名：");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入修改后的年龄：");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入修改后的家庭住址：");
        String newHome = sc.next();
        stu.setHome(newHome);

        System.out.println("信息修改成功");

    }

    public static void queryStudent(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("当前系统无学生信息，请添加信息后再来查询");
            return;
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" +stu.getHome());
        }
    }

    public static boolean contains(ArrayList<Student> list,String id){
//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
//            if(stu.getId().equals(id)){
//                return true;
//            }
//        }
//        return false;

        return getIndex(list,id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if(sid.equals(id)){
                return i;
            }
        }
        return -1;
    }

}
