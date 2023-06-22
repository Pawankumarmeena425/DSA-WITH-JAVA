package com.company;

public class LargestNumber {
    public static void main(String[] args) {
        int number[]={32,1,33,-34,-43,2,32,32,3,23,23,23,23,2,3,345,2,3,2,3,5};
        int val  = Integer.MIN_VALUE;
for (int i=1;i<number.length;i++){
    if (number[i]>val){
        val = number[i];
    }
}
        System.out.println("Largest Value in the array is !!"+val);

    }

}
