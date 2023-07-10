package com.company;

import java.util.Arrays;

public class Question_11_RotateArray {
    public static void rotateArray(int arr[],int k){
        int temp[]=new int[arr.length];
for (int i=0;i<arr.length;i++){
    temp[(i+k)%arr.length]=arr[i];
}
//arr=temp;
//arr = temp.clone();
        arr = Arrays.copyOf(temp,temp.length);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,7,-5,6,-4,9,-8,9,11,2,4,5,6,6,6,8};
        rotateArray(arr,5);

    }
}
