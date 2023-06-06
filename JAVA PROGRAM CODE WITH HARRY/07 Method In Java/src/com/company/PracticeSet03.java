package com.company;

public class PracticeSet03 {
    static int SumNatural(int n)
    {
        if (n==0)
        {
            return 0;
        }
        else{
        return n+SumNatural(n-1);}
    }
    public static void main(String[] args) {
        /*Write a recursive funciton to calculate first n natural number*/
        int num =20;
        int c =SumNatural(num);
        System.out.printf("Sum of first %d natural number is :: %d \n",num,c);
    }
}
