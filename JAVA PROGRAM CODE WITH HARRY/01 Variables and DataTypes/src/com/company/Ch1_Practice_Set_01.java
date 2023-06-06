package com.company;

import java.util.Scanner;

public class Ch1_Practice_Set_01 {
    public static void main(String[] args) {
        /*Write a program to add three number by Custom input*/
Scanner pa = new Scanner(System.in);
        System.out.println("Enter the first number::");
        int num1 = pa.nextInt();
        System.out.println("Enter the second number::");
        int num2 = pa.nextInt();
        System.out.println("Enter the third number::");
        int num3 = pa.nextInt();
        int sum= num1+num2+num3;
        System.out.println("Sum of these number::");
        System.out.println(sum);

    }
}
