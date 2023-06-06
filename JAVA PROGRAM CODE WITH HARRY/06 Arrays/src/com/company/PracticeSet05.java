package com.company;

public class PracticeSet05 {
    public static void main(String[] args) {
        /*Write a program to reverse an array*/
        int []arr={432,2423,423,4,43,34};
        int n =Math.floorDiv(arr.length,2);
        int temp;
        for (int i=0;i<n;i++)
        {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println("Reverse of the Array is ::");
        for (int element:arr
             ) {
            System.out.print(element+" ");
        }
    }
}
