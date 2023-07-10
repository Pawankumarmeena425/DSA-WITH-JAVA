package com.company;

public class ch19_PracticeQuestion {
    public static int  sumArray(int arr[],int si,int key){
        int sum=arr[si];
        if (si== arr.length){
            return -1;
        }
     if (arr[si]==key){
         return si;
     }

      return  sumArray(arr,si+1,key);


    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(sumArray(arr, 0,3)); ;
    }
}
