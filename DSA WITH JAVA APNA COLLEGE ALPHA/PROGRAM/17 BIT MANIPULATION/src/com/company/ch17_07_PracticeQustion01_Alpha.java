package com.company;

public class ch17_07_PracticeQustion01_Alpha {
    public static long power(int num){
        long ans=1;
        int pow = num;
        while(pow!=0){
            if ((pow&1)!=0){
                ans = ans*num;
            }
            else {
                ans = ans;
            }
            num  =num*num;
            pow = pow>>1;

        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(10));
    }
}
