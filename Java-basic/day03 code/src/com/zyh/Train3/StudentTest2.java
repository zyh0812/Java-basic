package com.zyh.Train3;

public class StudentTest2 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1,"张三",22);
        Student stu2 = new Student(2,"李四",23);
        Student stu3 = new Student(3,"王五",26);


        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        int index = getIndex(arr , 1);

        if(index > 0){
            arr[index] = null;
            printArr(arr);

        }else{
            System.out.println("删除失败");
        }
    }

    //遍历数组
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getStudentID()+ "," +stu.getName()+ "," + stu.getAge());
            }
        }
    }

    //取索引
    public static int getIndex(Student[] arr, int StudentId){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(StudentId == stu.getStudentID()){
                return i;
            }
        }
        return -1;
    }
}
