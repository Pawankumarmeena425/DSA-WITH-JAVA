package com.company;

import java.util.Scanner;

public class Ch_14_02_RuntimeError_Demo {
    public static void main(String[] args) {
        int k;
        System.out.println("Enter the number!!!!!!!!!");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
//        -------------<<<<<<<<<< If we type value of k is 0, then it gives runtime error (Infinite doesnot exit in java)
        System.out.println("Integer part of 1000 divided by k is " + 1000/k);
    }
}
