package com.company;

public class Question_08_ReverseOfArrayAtSpecificIndex {
    public static void reverseArray(int arr[],int n){
        int end=arr.length-1;
        int start = n+1;
        for (int i=1;i<=(arr.length-start)/2;i++){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
    }
    public static void main(String[] args) {
        int arr[]={1 ,2 ,3 ,4 ,5 ,6};
        reverseArray(arr,-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
