package com.company;

public class PracticeSet09 {
    public static void main(String[] args) {
        /*Write a program to calculte the sum of the numbers accuring to the multiplation table of 8*/
        int num = 8;
        int i=1;
        int sum=0;
        while (i<=10)
        {
            sum = sum+num*i;
            i++;
        }
        System.out.printf("Sum of the multiplation table of the 8 = %d.",sum);
    }
}
