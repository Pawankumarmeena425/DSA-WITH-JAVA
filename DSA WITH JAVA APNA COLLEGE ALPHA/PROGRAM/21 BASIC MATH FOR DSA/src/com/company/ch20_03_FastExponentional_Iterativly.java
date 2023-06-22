package com.company;

public class ch20_03_FastExponentional_Iterativly {
    public static int fastExponentionalItertivly(long a,int n,int m){
        long res =1;
         while(n!=0){
             if((n&1)!=0){
//                 last bit is 1
                 res =  (res*a)%m;
             }
             a =  (a*a)%m;
             n=n>>1;
         }
return (int)(res%m);
    }
    public static void main(String[] args) {
        System.out.println(fastExponentionalItertivly(10000000 ,10 ,10000005));
    }
}
