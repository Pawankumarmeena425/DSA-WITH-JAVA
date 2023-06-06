package com.company;

public class Ch_14_03_Exception {
    public static void main(String[] args) {
        int a =24234;
        int b =0;

//        Without using Try Catch , it give error and stoped the program
        int c  = a/b;
        System.out.println("The result is "+c);


//        Using try Catch, Its handle the exception , And run program to forward after display msg
//        try {
//            int c  = a/b;
//            System.out.println("The result is "+c);
//        }
//        catch (Exception e ){
//            System.out.println("We failed to divide the number:: Reason!!!");
//            System.out.println(e);
//        }



    }
}
