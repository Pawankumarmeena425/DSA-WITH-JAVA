package com.company;

import java.util.Scanner;

class NegRadiusExeption extends Exception{
    @Override
    public String toString(){
        return  " Radius can't be Negative";
    }
    @Override
    public String getMessage(){
        return " Pls Enter a valid Radius";
    }
}


public class Ch_14_08_Throw_Vs_Throws {
    public static int divide (int a,int b) throws ArithmeticException{
// Made by harry
        int result  =a/b;
        return result;
    }

    public static double area (double radius) throws NegRadiusExeption{
        if(radius<0){

                throw new NegRadiusExeption();

        }
        double result  = Math.PI*radius*radius;
        return result;
    }
    public static void main(String[] args) {
//        Shivam - Uses Divide function created by harry
        try {
            int c = divide(5, 1);
            System.out.println("Value of c after divide "+c);
        }
        catch (Exception e ) {
            System.out.println("Exception Occured!!!");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Radius!!!");
        double r = sc.nextDouble();
            try {
                double result = area(r);
                System.out.println("Ares of Circle " + result);
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }


    }
}
