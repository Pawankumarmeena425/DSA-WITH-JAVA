package com.company;
import java.util.Scanner;
public class PracticeSet03 {
    public static void main(String[] args) {
        /*Calculate the average marks from an array containing marks of all students in physic using
        * for each loop*/
        Scanner sc = new Scanner(System.in);
        int []marks = new int[10];
        System.out.println("Enter the marks of 10 student in the Physic Subject!!");
        for (int i=0;i< marks.length;i++)
        {
            marks[i]=sc.nextInt();
        }
        int total=0;
        for (int val :
                marks) {
            total = total+val;
        }
        System.out.println("Average of all student marks is ::"+total/10);
    }
}
