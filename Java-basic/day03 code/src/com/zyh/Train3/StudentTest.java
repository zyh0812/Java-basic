package com.zyh.Train3;


public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1,"张三",22);
        Student stu2 = new Student(2,"李四",23);


        arr[0] = stu1;
        arr[1] = stu2;

        //进行添加操作
        Student stu4 = new Student(4,"老6",19);
        boolean flag = contains(arr, stu4.getStudentID());
        int count = sumArr(arr);
        if(flag){
            System.out.println("填入的学号已存在，请修改后进行添加");
        }else {
            if(count == arr.length){
                Student[] newArr = newArr(arr);
                newArr[count] = stu4;
                printArr(newArr);

            }else{
                arr[count] = stu4;
                printArr(arr);
            }
        }
        //通过id删除学生信息


    }

    //遍历数组
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null){
                System.out.println(stu.getStudentID() + "," + stu.getName() + "," + stu.getAge());
            }
        }

    }

    //判断学号在数组中的唯一性
    public static boolean contains(Student[] arr, int studentID){
        for (int i = 0; i < arr.length; i++) {

            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getStudentID();
                if(sid == studentID){
                    return true;
                }
            }
        }
        return false;
    }

    //计算
    public static int sumArr(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    public static Student[] newArr(Student[] arr){
        Student[] newArr = new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
