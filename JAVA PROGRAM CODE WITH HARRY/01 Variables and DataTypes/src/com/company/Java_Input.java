package com.company;

import  java.util.Scanner;
public class Java_Input {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user");
        Scanner s= new Scanner(System.in);
//        System.out.println("Enter first number");
//        int a = s.nextInt();
//        System.out.println("Enter first number");
//        int b= s.nextInt();
//        int sum=a+b;
//        System.out.println("The sum of these number is ");
//        System.out.println(sum);
//
//        System.out.println("Enter the integer number");
//        boolean bool = s.hasNextInt();
//        System.out.println(bool);
        System.out.println("Enter the string");
//        String str = s.next();
        String str = s.nextLine();
        /* By using s.next() we can't take whitespace but we can take whitespace by usign the s.nextLine() */
        System.out.println(str);


    }
}
