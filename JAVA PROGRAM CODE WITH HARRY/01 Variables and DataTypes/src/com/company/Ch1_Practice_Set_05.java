package com.company;
import java.util.Scanner;
public class Ch1_Practice_Set_05 {
    public static void main(String[] args) {
        /*Write a program to detect wheather a number entered by the user is integer or not*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:::");
        boolean b1 = sc.hasNextInt();
        System.out.println("Entered number is a integer!! "+b1);
    }
}
