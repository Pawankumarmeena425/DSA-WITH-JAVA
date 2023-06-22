package com.company;

public class ch17_03_BitOperation {
    public static int getBit(int num,int i){
        int bitMask= (1<<i);
        if ((num&bitMask)==0){
            return 0;
        }
        else {
            return 1;
        }

    }
    public static int setBit(int num,int i){
        int bitMask = (1<<i);
        return bitMask | num;
    }
    public static int clearBit(int num,int i){
        int bitMask = ~(1<<i);
        return bitMask&num;
    }
    public static int updateBit(int num,int i, int newBit){
//        if (newBit==0){
////            Clear Bit
//            return clearBit(num,i);
//        }
//        else {
//            return setBit(num,i);
//        }

//        2nd Way
        num =clearBit(num,i);
//        NOw at ith position valeu will be zero
int bitMask = (newBit<<i);
return bitMask|num;
            }
            public static int clearLastBit(int num,int i){
        int bitMask = (~0<<i);
        return bitMask&num;
            }
            public static int clearBitInRange(int num,int i ,int j){
        int a = (~0)<<(j+1);
        int b  = (1<<i)-1;
        int bitMask  = a|b;
        return num&bitMask;
            }
    public static void main(String[] args) {
        System.out.println(getBit(10,2));
        System.out.println(setBit(10,2));
        System.out.println(clearBit(10,1));
        System.out.println(updateBit(10,2,1));
        System.out.println(clearLastBit(10,2));
        System.out.println(clearBitInRange(12,4,5));
    }
}
