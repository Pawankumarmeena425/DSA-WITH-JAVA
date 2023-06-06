package com.company;
 import  java.util.Scanner;
public class Basic_Conditional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter your age::\n");
        int age = s.nextInt();

        if (age>=18)
        {
            System.out.printf("Yes boy you can drive::\n");
        }
        else
        {
            System.out.printf("You can't drive yet!!\n");
        }

//        2nd Way
        boolean cond = (age>=18);
        if (cond)
            {
                System.out.println("Yes boy you can drive::\n");
            }
            else
            {
                System.out.println("You can't drive yet!!\n");
            }

    }
}
