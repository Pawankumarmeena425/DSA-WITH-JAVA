package com.company;


import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
//        Check whether a number is prime or not
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter the number! \nEnter 0 if you want to exit!!");
           int num  = sc.nextInt();
           if (num==0){
             break;
              }
           for (int i=2;i<=num;i++){
               if(i==num){
                   System.out.println(num + " is  a prime number!!");
                   break;
               }
               if (num%i==0){
                   System.out.println(num +" is not a prime number !!");
                   break;
               }
           }

        }
    }
}
