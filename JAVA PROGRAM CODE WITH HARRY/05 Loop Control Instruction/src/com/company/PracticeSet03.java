package com.company;
import java.util.Scanner;
public class PracticeSet03 {
    public static void main(String[] args) {
        /*Write a program to print multiplation table of a given number n*/
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number which you want to print the multiplation table");
        int num = sc.nextInt();
        System.out.println("Multiplation table of "+num+"is::");
        int i=1;
        while (i<=10)
        {
            System.out.printf("%d * %d = %d\n",num,i,num*i);
            i++;
        }
    }
}
