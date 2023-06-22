package com.company;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
//        Write a program to check whether a number is palindrome or not
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the number!!!");
        int num  = sc.nextInt();
        int rev =0;
        int orgnum = num;

        while (num!=0){
         int r  = num%10;
         num = num/10;
         rev  = r+rev*10;
        }
        System.out.println(rev);
        if (rev==orgnum){
            System.out.println(orgnum+" is a Palindrome number!!");
        }
        else{
            System.out.println(orgnum+" is not  a Palindrome number!!");
        }
    }
}
