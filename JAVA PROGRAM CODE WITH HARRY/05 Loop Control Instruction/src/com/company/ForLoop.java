package com.company;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        /*Write a java program to print first n odd natural number using the for loop*/
//        2n = Even Numbers = 0,2,4,6,8
//        2n+1  = Odd Numbers = 1,3,5,7,9
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the number ::");
        int num = sc.nextInt();
        System.out.printf("First %d odd natural number is ::\n",num);
        for (int i =0;i<num;i++)
        {
            System.out.println(2*i+1);


        }
    }
}
