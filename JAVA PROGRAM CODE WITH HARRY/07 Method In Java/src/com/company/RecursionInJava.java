package com.company;

public class RecursionInJava {
//    factorial(n) = n*factorial(n-1)
    static int fact(int n)
    {
        if (n== 0||n==1)
        {
            return 1;
        }

        else
        {
            return n*fact(n-1);
        }
    }
    static int fact_itaretivaly(int n)
    {
        if (n== 0||n==1)
        {
            return 1;
        }
        else
        {
            int product=1;
           for (int i=1;i<=n;i++)
           {
               product *=i;
           }
           return product;
        }
    }
    public static void main(String[] args) {
        int x=0;
        System.out.println("Factorial of "+x+" Using the recrsion is :: "+fact(x));
        System.out.println("Factorial of "+x+" Using the itaretivaliy apporch is :: "+fact_itaretivaly(x));
    }
}
