package com.company;

public class ch17_02_Get_ith_bits {
    public static int getBit(int num, int i){
        int bitMarks = 1<<i;
        if ((num&bitMarks)==0){
            return 0;
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {

        int num = 10;
        int i = 3;
        System.out.println(getBit(num,i));
    }
}
