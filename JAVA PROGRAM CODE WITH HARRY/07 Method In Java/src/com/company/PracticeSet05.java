package com.company;

public class PracticeSet05
{
    static int fib(int n)
    {
        if (n==1||n==2)
        {
            return n-1;
        }

        else
        {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        int n = 10;
//        In the fibonacci series if use terms then we start from the 1
//        if use index then we start from 0
        int result = fib(n);
        System.out.printf("Fibonacci Value of %dth terms:: %d",n,result);
    }
}
