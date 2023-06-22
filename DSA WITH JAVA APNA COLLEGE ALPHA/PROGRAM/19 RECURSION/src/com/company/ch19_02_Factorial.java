package com.company;

import java.util.Scanner;

public class ch19_02_Factorial {
    public static int fact(int num ){
        if(num==0){
            return 1;
        }
        int val = fact(num-1);
        int f  = num*val;
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number which you want to print!!! ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println( fact(num));
    }
}
