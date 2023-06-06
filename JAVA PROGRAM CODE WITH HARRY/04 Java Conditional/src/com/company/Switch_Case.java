package com.company;
import java.util.Scanner;


public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age::");
        int age  = sc.nextInt();
        switch (age){

            case 18:
                System.out.println("you are going to become an Adult!!!");
                break;
            case 23:
                System.out.println("you are going to join a job!!!");
                break;
            case 55:
                System.out.println("you are going to get retired!!!");
                break;
            default:
                System.out.println("Enjoy Your life!!");
        }

        /*Switch case can be String as well as integer and character*/
    }
}
