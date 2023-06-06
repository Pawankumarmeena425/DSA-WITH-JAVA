package com.company;
import java.util.Scanner;
public class Ch1_Practice_Set_02 {
    public static void main(String[] args) {
        /*Write a program to Calculate CGPA Using marks of three subject*/
        int total;
        Scanner pa = new Scanner(System.in);
        System.out.println("Enter the marks of subject Hindi::");
        int h = pa.nextInt();
        System.out.println("Enter the marks of subject English::");
        int e = pa.nextInt();
        System.out.println("Enter the marks of subject Maths::");
        int m = pa.nextInt();
        System.out.println("Enter the marks of subject Physic::");
        int p = pa.nextInt();
        System.out.println("Enter the marks of subject Chemisty::");
        int c = pa.nextInt();
        total = h+e+m+p+c;
        System.out.print("Total Marks of the student:::");
        System.out.println(total);
        float d = 500*9.5f;
       float cgpa = (float) total*100/d;
        System.out.print("Total CGPA of the student:::");
        System.out.println(cgpa);
    }
}
