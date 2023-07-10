package com.company;

public class ReverseArray {
    public static void main(String[] args) {
        int number[]={12,42,4,23,1,3,12,42,31,5};
        int start=0;
        int end=  number.length-1;
        int j=0;
        while (j<=number.length/2){
            int temp = number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
            j++;
        }
        for (int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
