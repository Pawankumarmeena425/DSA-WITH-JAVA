package com.company;

public class Question_02_SubArray {
    public static void subarray(int arr[]){
        int prefix[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            if (i==0){
                prefix[i]=arr[i];
            }
            else {
                prefix[i] = prefix[i - 1] + arr[i];
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum=0;
        for (int i=0;i<arr.length;i++){

            for (int j=i;j<arr.length;j++){
                sum = 0;
                if (i==0){
                    sum = prefix[j];
                }
                else {
                    sum = prefix[j] - prefix[i - 1];
                }
                if (sum > max) {
                    max = sum;
                }
                if (sum<min){
                    min = sum;
                }
            }
        }
        System.out.println("Maximum Sum Of  SubArrays = "+max);
        System.out.println("Minimum Sum Of  SubArrays = "+min);

    }
    public static void main(String[] args) {
        int num[]={7,4,-6,3,6,-2};
subarray(num);
    }
}
