package com.company;

public class ch19_07_XtoPowerN {
    public static int power (int x,int n){
         if (n==0){
             return 1;
         }
         return x*power(x,n-1);
    }
    public static void main(String[] args) {
       int val =  power(2,10);
        System.out.println(val);
    }
}
