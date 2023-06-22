package com.company;

import java.util.Scanner;

public class ch17_01_EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num= sc.nextInt();
        int bitMarks=1;
        if ((bitMarks&num)==0){
            System.out.println("Even Number!!");
        }
        else {
            System.out.println("Odd Number!!");
        }

    }
}
