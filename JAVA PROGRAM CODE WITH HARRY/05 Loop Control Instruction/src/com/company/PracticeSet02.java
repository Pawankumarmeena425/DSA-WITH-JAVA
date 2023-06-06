package com.company;
import java.util.Scanner;
public class PracticeSet02 {
    public static void main(String[] args) {
        /*Write a  java program to sum first n even numbers using while loop*/
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the value of the number::");
        int num = sc.nextInt();
        int sum=0;
        int i=0;
        while (i<num)
        {
            sum = sum+2*i;
            i++;
        }
        System.out.println("Sum of the first "+num+" even natural Number = "+sum);
    }
}
