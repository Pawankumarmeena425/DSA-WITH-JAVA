package com.company;

public class practiceSet02 {
    static void pattern(int n)
    {
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        /*Write a program to print the following pattern usign the funciton*/
        int n=9;
        pattern(n);
    }
}
