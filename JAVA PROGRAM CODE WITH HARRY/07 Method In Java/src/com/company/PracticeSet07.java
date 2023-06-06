package com.company;

public class PracticeSet07 {
    static void pettern_rec(int n)
    {
        if (n>0)
        {
            for (int i=1;i<=n;i++)
            {
                System.out.printf("* ");
            }
            System.out.printf("\n");
            pettern_rec(n-1);
        }

    }
    public static void main(String[] args) {
        int n = 4;
        pettern_rec(n);
    }
}
