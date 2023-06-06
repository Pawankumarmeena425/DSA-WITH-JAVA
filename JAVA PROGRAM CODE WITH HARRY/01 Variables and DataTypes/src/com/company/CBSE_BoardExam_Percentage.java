package com.company;
import java.util.Scanner;
public class CBSE_BoardExam_Percentage {
    /*Write a program to calculte percentage of a given student in CBSE board exam. His marks from 5 subjects
    * must be taken as input from the keyword.
    * (Marks are out of 100)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Hindi");
        int h = sc.nextInt();
        System.out.println("Enter the marks of English");
        int e = sc.nextInt();
        System.out.println("Enter the marks of Maths");
        int m = sc.nextInt();
        System.out.println("Enter the marks of Chemistry");
        int c = sc.nextInt();
        System.out.println("Enter the marks of Physic");
        int p = sc.nextInt();
        int total = h+e+m+p+c;
        System.out.println("Total Marks of the Studen::"+total);
        float per;
        per = total*100/500;
        System.out.println("Percentage of the Student::"+per);






    }
}
