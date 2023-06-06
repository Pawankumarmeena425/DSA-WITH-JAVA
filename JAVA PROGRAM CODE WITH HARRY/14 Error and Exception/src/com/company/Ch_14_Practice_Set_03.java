package com.company;

import java.util.Scanner;

public class Ch_14_Practice_Set_03 {
    public static void main(String[] args) {
        /*  Write a program that allows you to keep accessing an array until a valid index is given.
       * If max retries exceed 5 print "Error"*/
        int []marks = {23,21,312,3,2,32,1};
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the array index, Which you want to access!!");
            int index = sc.nextInt();
            try {
                System.out.println("The value at desired index is " + marks[index]);
                System.out.println(marks[index]/index);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Something error Occured!!");
                System.out.println(e);
                break;
            }
            catch (ArithmeticException e)
            {
                System.out.println("Something error occured!!!");
                System.out.println(e);
                break;
            }

        }

    }
}
