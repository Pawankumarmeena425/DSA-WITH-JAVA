package com.company;

public class Ch_18_00_ConstructoreBasic {


    public static void main(String[] args) {
Student s1 = new Student();

Student s2 = new Student(243);
        Student s3 = new Student("pawan kumar meena ");

        Student s4 = new Student(s3);


    }


}
class Student{
    Student(){
        System.out.println("I am no argoument constructoere");
    }
    Student(String str){
        System.out.println("I am String argoument constructoere");
    }

    Student(int roll){
        System.out.println("I am roll argoument constructoere");
    }

    Student (Student s1){

    }
}