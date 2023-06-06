package com.company;

public class MethodUsingObjectCreation {
    int logic(int x, int y)
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

//        Method invocation using object creation


        MethodUsingObjectCreation obj = new MethodUsingObjectCreation();

        int c =obj.logic(a,b);
        int a1,b1;
        a1=7;
        b1=2;
        int c1= obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
