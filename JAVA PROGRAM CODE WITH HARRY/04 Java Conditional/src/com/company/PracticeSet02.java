package com.company;
import java.util.Scanner;

public class PracticeSet02 {
    public static void main(String[] args) {
/*Write a java program to find out whether a student is pass or fail. if it requires total 40% and
*  atleast 33% in each subject to pass.
*  Assume 3 subject and take marks as an input fromm the user.*/

        Scanner S = new Scanner(System.in);
        System.out.println("Enter marks of Maths!!");
       byte m = S.nextByte();
        System.out.println("Enter marks of Chemistry!!");
        byte c = S.nextByte();
        System.out.println("Enter marks of physic!!");
        byte p = S.nextByte();
        int total = m+c+p;
        float per =  total*100/300f;
        if (per>=40&&m>=33&&p>=33&&c>=33){
            System.out.println("Student Pass!!Congratulation");
        }
        else {
            System.out.println("Student Fail!!Better Again");
        }

    }
}
