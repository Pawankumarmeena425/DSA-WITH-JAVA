package com.company;

import java.util.Scanner;

public class ch19_01_printnumber {
//    Print number for 1 to n (Decreasing Order)
    public static int recursionDec(int num){
        System.out.print(num+" ");
        if (num==1){
            return 0;
        }
       recursionDec(num-1);
        return 0;
    }

    //    Print number for 1 to n (Increase Order)
    public static int recursionInc(int num){

        if (num==1){
            System.out.print(num+" ");
            return 0;
        }
        recursionInc(num-1);

        System.out.print(num+" ");

        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number which you want to print!!! ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//       recursionDec(num);
       recursionInc(num);
    }
}
