package com.company;

public class Question_13_SumOfArrays {
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        // Write your code here.
        int sum1=0,sum2=0,sum=0;
        int length=0;
        for(int i=0;i<n;i++){
            sum1 = sum1*10+a[i];
        }
        for(int j=0;j<m;j++){
            sum2 = sum2*10+b[j];
        }
        sum = sum1+sum2;
        int val = sum;

        while(val!=0){
            val = val/10;
            length++;
        }
        int arrsum[]=new int[length];
        int i=arrsum.length-1;
        while(sum!=0){
            arrsum[i]=sum%10;
            sum = sum/10;
            i--;
        }
        return arrsum;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,4,6};
        int arr2[]={5,8,9};
        int sum[]= findArraySum(arr1,arr1.length,arr2,arr2.length);
        for (int j=0;j<sum.length;j++){
            System.out.print(sum[j]+" ");
        }
    }
}
