package com.company;
import java.util.Scanner;
public class Ch1_Practice_Set_03 {
    public static void main(String[] args) {
        /*Write a java program which asks user to enter his name and print them as follow::
        * "Hello <name> have a good day" */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name::");
        String name = sc.nextLine();
//        System.out.print("Hello ");
//        System.out.print(name);
//        System.out.print(" have a good day");
        System.out.print("Hello <" + name +"> have a good day!!");
    }

}
