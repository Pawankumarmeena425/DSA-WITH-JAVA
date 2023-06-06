package com.company;

public class PracticeSet06 {
    public static void main(String[] args) {
        /*Write a java program to find the maximum number in the array*/
        int []arr={234,32423,4234,23,423,423,42,4,242,34,234,-324,23423,-23423,32,324,234};
        int max = Integer.MIN_VALUE;
//        In the max store the minimum value of the integer range
        for (int i=0;i< arr.length ;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum Number of the Array is ::"+max);
    }
}
