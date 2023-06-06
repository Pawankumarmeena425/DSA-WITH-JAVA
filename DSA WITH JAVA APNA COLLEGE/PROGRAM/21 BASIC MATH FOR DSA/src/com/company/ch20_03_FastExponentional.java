package com.company;

public class ch20_03_FastExponentional {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.

        if(n==0){
            return 1;}
        long hpower = modularExponentiation(x,n/2,m)%m;
//        If we don't make hpower long then hpower*hpower may be overflow in integer range
        long hpowersq = (hpower*hpower)%m;
        if((n&1)!=0){
//            Typecast to integer
            return (int)((hpowersq*x)%m);
        }
        return (int)(hpowersq%m);
    }
    public static void main(String[] args) {
        System.out.println(modularExponentiation(104545424,2454545,1000000007));
    }
}
