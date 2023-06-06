package com.company;

public class PracticeSet01 {
    public static void main(String[] args) {
        /*Write a java program to print the following pattern
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *                         */
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
