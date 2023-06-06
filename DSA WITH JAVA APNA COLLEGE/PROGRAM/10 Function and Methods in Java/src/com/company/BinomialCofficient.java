package com.company;


import java.util.Scanner;

public class BinomialCofficient {

    public static int fact(int n){
int f = 1;
for (int i = n;i!=0;i--){
    f = f*i;
}
        return  f;
    }

    public static int binCoff(int n,int r){
        int bc;
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nr =  fact(n-r);
        bc  = fact_n/(fact_r*fact_nr);
        return bc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(binCoff(5,2));
    }
}
