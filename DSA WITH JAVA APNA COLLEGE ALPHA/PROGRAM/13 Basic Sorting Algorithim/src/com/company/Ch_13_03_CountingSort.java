package com.company;

public class Ch_13_03_CountingSort {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count []= new int[largest+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for (int j=0;j< count.length;j++){
           while (count[j]!=0){
                arr[k]=j;
                k++;
                count[j]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,6,2,4,2,1,3,4,5,7,3,3,9};
        countingSort(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
