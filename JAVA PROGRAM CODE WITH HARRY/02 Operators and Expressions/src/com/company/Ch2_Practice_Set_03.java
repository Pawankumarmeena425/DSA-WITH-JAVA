package com.company;
import java.util.Scanner;
public class Ch2_Practice_Set_03 {
    public static void main(String[] args) {
        /*Write a java program to find out weather a given number is greater then the user entered number or not*/
        int num = 423;
        Scanner pa = new Scanner(System.in);
        System.out.println("Enter the number::");
        int n = pa.nextInt();


        System.out.print("Is user entered number is greater then the real number::");
        System.out.println(n>num);

    }
}
