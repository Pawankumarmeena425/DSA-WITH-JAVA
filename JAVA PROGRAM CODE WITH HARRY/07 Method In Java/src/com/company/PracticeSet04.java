package com.company;

public class PracticeSet04 {
    static void pattern(int n)
    {
        for (int i=1;i<=n;i++){
            for (int j=n-i+1;j!=0;j--)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        /*Write a function to print the following pattern */
        int num = 4;
        pattern(num);
    }
}
