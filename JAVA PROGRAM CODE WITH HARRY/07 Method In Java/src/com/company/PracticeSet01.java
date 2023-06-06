package com.company;

public class PracticeSet01 {
     void mult(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
         PracticeSet01 obj =  new PracticeSet01();
        int num=12;
       obj.mult(num);
    }
}
