package com.company;
import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age::");
        int age  = sc.nextInt();
        if (age>60){
            System.out.println("You are experienced::");
        }
       else if (age>50){
            System.out.println("You are semi-experienced::");
        }
        else if (age>50){
            System.out.println("You are semi-semi-experienced::");
        }
        else{
            System.out.println("You are not experienced!!");
        }
    }
}
