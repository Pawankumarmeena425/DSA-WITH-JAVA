package com.company;

public class BinaryToDecimal {
    public static double BtoD(int num){
        int pow =0;
        double dec = 0;
        int ld;
        while(num!=0){
            ld = num%10;
            dec  =  dec + (ld*Math.pow(2,pow));
//          Math.pow function provide only double values , but we can
//            typecast it
            pow++;
            num = num/10;
        }
return dec;
    }
    public static void main(String[] args) {
        System.out.println(BtoD(1000));
    }
}
