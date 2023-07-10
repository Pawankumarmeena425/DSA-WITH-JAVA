package com.company;

public class DectimalToBinary {
    public static void main(String[] args) {
        int num=50;
        int val = 1;
        int binary = 0;
        while(num!=0){
            int rem =  num%2;
            num =  num/2;
            binary  = binary+val*rem;
            val = 10*val;
        }
        System.out.println(binary);
    }
}
