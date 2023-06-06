package com.company;

public class PracticeSet08 {
    static void pettern_rec(int n)
    {
       if (n>0)
       {
           pettern_rec(n-1);
           for (int i=1;i<=n;i++)
           {
               System.out.printf("* ");
           }
           System.out.printf("\n");
       }

    }
//    pattern_rec(3)
//    pattern_rec(2)+3 star and new line
//    pattern_rec(1)+2 star and new line + 3 star and new line
//    pattern_rec(0)+1 star and new line + 2 star and new line + 3 star and new line
    public static void main(String[] args) {
        /*Repeat problem using recursion */
        int n = 4;
pettern_rec(n);
    }
}
