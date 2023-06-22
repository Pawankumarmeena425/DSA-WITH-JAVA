package com.company;

public class ch20_02_GCD_OfTwoNumber {
    public static int gcd(int a,int b){
        if(a<=0){
            return b;
        }
      if(a<b){
          int temp=a;
          a=b;
          b=temp;
      }
       return gcd(a%b,b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(25,725));
        int n=16;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
