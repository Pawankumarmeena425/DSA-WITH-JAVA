package com.company;

public class PairInArray {
    public static void pair(int number[]){
        for (int i=0;i<number.length;i++){
            for (int j=i+1;j<number.length;j++){
                System.out.print(number[i]+","+number[j]+"   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={12,23,15,42,23};
        pair(number);
    }
}
