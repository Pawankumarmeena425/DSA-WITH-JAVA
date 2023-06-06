package com.company;
import java.util.Scanner;
public class PracticeSet05 {
    public static void main(String[] args) {
        /*Write a program to find the factorial of a given number::*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want the factorial::");
        int num = sc.nextInt();
        int fact =1;
        for (int i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.printf("Factorial of %d is :: %d\n",num,fact);
    }
}
