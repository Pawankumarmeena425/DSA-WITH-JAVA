package com.company;

public class ch19_08_XtoPowerN_Optimised {
    public static int optimisedPower(int x,int n){
        if (n==0){
            return 1;
        }
int halfpower = optimisedPower(x,n/2);
        int halfpowersq  = halfpower*halfpower;
        if (n%2!=0){
            halfpowersq = x*halfpowersq;
        }

        return halfpowersq;
    }
    public static void main(String[] args) {

    }
}
