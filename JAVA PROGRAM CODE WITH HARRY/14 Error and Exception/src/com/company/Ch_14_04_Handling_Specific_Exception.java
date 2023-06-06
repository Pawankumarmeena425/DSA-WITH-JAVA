package com.company;

import java.util.Scanner;

public class Ch_14_04_Handling_Specific_Exception {
    public static void main(String[] args) {
         int [] marks = new int[3];
         marks[0]=324;
         marks[1]=43;
         marks[2]=24;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index:::");
        int index = sc.nextInt();
        System.out.println("Enter the number which you want to divide with!!");
        int number  = sc.nextInt();
        try{
            System.out.println("The value at array idenx entered is :: " + marks[index]);
            System.out.println("The value of arry-value / number is !! "  +marks[index]/number);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException Occured in the System!!!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException Occured in the System!!!");
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println("Something Other  Exception Occured in the System!!!");
            System.out.println(e);
        }
    }
}
