package com.company;

import java.util.Scanner;

public class Ch_14_06_Quick_Quiz {
    public static void main(String[] args) {
        /* Write a  java program that allows you to keep accessing an arry until a valid index is given by the user

        * */
        int [] marks = {23,1,2,4,34,42,32,3,23,2,323,342,34,344};

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Array index:::");
            int index = sc.nextInt();
            System.out.println("Enter the number which you want to divide with!!");
            int number = sc.nextInt();
            try{
                System.out.println("Value a the index Entered by you "+marks[index]);
                System.out.println("Array - value / Number = " + marks[index]/number);
            }
            catch (ArithmeticException e)
            {
                System.out.println("ArithmeticException Occured in the System!!!");
                System.out.println(e);
                break;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBoundsException Occured in the System!!!");
                System.out.println(e);
                break;
            }
            catch (Exception e)
            {
                System.out.println("Something Other Exception Occured in the System!!!");
                System.out.println(e);
                break;
            }
        }

        System.out.println("Terminating the Program!!");
    }
}
