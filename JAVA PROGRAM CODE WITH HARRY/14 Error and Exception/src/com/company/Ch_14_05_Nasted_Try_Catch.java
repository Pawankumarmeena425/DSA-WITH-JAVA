
package com.company;

import java.util.Scanner;

public class Ch_14_05_Nasted_Try_Catch {
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

        try {
            System.out.println("Welcome the the java Course!!!");
            try {
                System.out.println(marks[index]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Sorry this index doesn't exist!!");
                System.out.println(e);
                System.out.println("Exception in level 2 !!!");
            }
        }
        catch (Exception e )
        {
            System.out.println("Something Exception Occured!!");
            System.out.println(e);
        }
    }
}
