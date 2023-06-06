package com.company;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {

        /*Write a java program to print first n natural numbers using do-while loop*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the number where you want to print the number::");
        int n = sc.nextInt();
        int i=1;

        do{
            System.out.println(i);
            i++;
        }while (i<=n);
    }
}
