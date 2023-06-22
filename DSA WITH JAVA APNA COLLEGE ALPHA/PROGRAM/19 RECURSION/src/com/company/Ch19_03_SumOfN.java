package com.company;

import java.util.Scanner;

public class Ch19_03_SumOfN {
    public static int sumOfNatural(int num){
        if (num==1){
            return 1;
        }
        return num+sumOfNatural(num-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number which you want to print!!! ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOfNatural(num));;;;

    }
        }
