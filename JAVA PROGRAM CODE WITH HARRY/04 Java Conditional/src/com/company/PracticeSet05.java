package com.company;
import java.util.Scanner;
public class PracticeSet05 {
    public static void main(String[] args) {
        /*Write a java program to check weather a year is leap year or not*/
        Scanner java = new Scanner(System.in );
        System.out.println("Enter the Year!!!");
        int year = java.nextInt();
        if (year%400==0)
        {
            System.out.printf("%d Year is  a leap Year!!!",year);

        }
        else if (year%100==0)
        {
            System.out.printf("%d Year is not a leap Year!!!",year);
        }
        else if(year%4==0)
        {
            System.out.printf("%d Year is  a leap Year!!!",year);
        }
        else
        {
            System.out.printf("%d Year is not a leap Year!!!",year);
        }
    }
}
