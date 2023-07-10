package com.company;

public class ch17_06_FastExpontention {
    public static int fastExpontention(int num,int pow,int  m ){
        int ans  =1;
        while(pow!=0){
            if ((pow&1)!=0){
                ans = ans*num;
            }
            else{
                ans = ans*1;
//                0 bit condition
            }
            num = num*num;
            pow = pow>>1;
        }
        return ans%m;
    }
    public static void main(String[] args) {
        System.out.println(fastExpontention(5 , 125 , 7));
    }
}
