package com.company;

public class MethodOverloading {
    static void fun()
    {
        System.out.println("Good Morning Bro!!!");
    }
     void fun(int a)
    {
        System.out.println("Good Morning "+a+" Bro!!!");
    }

    static void fun(int a, int b)
    {
        System.out.println("Good Morning "+a+" Bro!!!");
        System.out.println("Good Morning "+b+" Bro!!!");
    }
    static int fun(int a, int b,int c)
    {
        System.out.println("Good Morning "+a+" Bro!!!");
        System.out.println("Good Morning "+b+" Bro!!!");

        return c;
    }
    public static void main(String[] args) {
        fun();
        MethodOverloading obj = new MethodOverloading();
//        Function Calling by creating objection creation
       obj.fun(234);
        fun(567,23423);
        fun(24,321,31);

//        We can make alternative method of same name but perameter must be different.
//        Java understand automatically type of which perameter method are use according to the call

        /*  """""""""Difference between the argument and perameter""""""""""""""""
        *  Argument are actual
        * **** In the main function argument are pass to the call funciton
        * *** In the calling function argument are called perameter*/
    }
}
