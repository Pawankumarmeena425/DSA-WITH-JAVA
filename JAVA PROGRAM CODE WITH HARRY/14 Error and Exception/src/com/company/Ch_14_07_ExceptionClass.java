package com.company;


import java.util.Scanner;

class MyExeption extends Exception{
    @Override
    public String toString(){
        return  " I am in the toString Method()";
    }
    @Override
    public String getMessage(){
        return " I am in the getMessage Method()";
    }
}
public class Ch_14_07_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the Number!!");
        int a =  sc.nextInt();
        if (a<10)
        {
            try{
                throw new MyExeption();
//                throw new ArithmeticException("This is an Arithmetic Exception!!!");
            }
            catch (Exception e ){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
//                -------------<<<<<<<<<< If we don't give the method name and give only exception then it will toString Method
//                by Default ------------------->>>>>>>>>>>>>>>>>>>>>

e.printStackTrace();
                System.out.println("Finished !!");
            }
        }
        System.out.println("I am outside the if and program is finished!!!");
    }
}
