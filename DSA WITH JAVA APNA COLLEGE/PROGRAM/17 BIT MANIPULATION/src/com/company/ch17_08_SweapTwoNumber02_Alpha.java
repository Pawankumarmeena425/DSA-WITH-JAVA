package com.company;

public class ch17_08_SweapTwoNumber02_Alpha {

    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;
        n1 = n1^n2;
        n2 = n1^n2;
        n1 = n1^n2;
        System.out.println(n1);
        System.out.println(n2);
    }
}
