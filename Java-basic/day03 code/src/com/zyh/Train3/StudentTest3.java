package com.zyh.Train3;

public class StudentTest3 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1,"张三",22);
        Student stu2 = new Student(2,"李四",23);
        Student stu3 = new Student(3,"王五",26);


        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        int index = getId(arr,4);

        if(index >= 0){

            int newAge = arr[index].getAge() + 1;
            arr[index].setAge(newAge);
            for (int i = 0; i < arr.length; i++) {
                Student stu = arr[i];
                System.out.println(stu.getStudentID() + "," + stu2.getName() + "," + stu.getAge());
            }


        }else{
            System.out.println("ID不存在，请修改");
        }




    }

    public static int getId(Student[] arr, int studentId){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(studentId == stu.getStudentID()){
                return i;
            }
        }
        return -1;
    }

}
