package com.company;

public class MethodBasic {
    static  int logic(int x, int y)
    {
        int z;
        if (x<y)
        {
            z = x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=3,b=6;
        int c = logic(a,b);
        int a1,b1;
        a1=7;
        b1=2;
        int c1= logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
