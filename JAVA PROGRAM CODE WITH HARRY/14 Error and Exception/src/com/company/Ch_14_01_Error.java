package com.company;

public class Ch_14_01_Error {
    public static void main(String[] args) {
//       Logical Error Demo:::
//        Write a program to print all prime numbers between 1 to  10
        System.out.println(2);
        for (int i=0;i<5;i++)
        {
            System.out.println(2*i+1);
        }
//        -------------->>> It's also print 9 which is not a prime number. It's means your logic is wrong  ----->>>>>>>>

    }
}
