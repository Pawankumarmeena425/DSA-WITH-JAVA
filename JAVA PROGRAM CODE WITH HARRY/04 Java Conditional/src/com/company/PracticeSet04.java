package com.company;
import  java.util.Scanner;

public class PracticeSet04 {
    public static void main(String[] args) {
        /*Write a java program to find out the day of the week given the number [1 for Monday, 2 for tuesday.....
        * and so on*/

Scanner sc  = new Scanner( System.in);
        System.out.println("Enter the code for the week days!!!");
        byte code = sc.nextByte();
        switch (code){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;



        }
    }
}
