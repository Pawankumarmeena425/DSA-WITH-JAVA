package com.company;

public class ch23_03_HeapSort {
    public static void heapifyMax(int arr[],int i,int size){
        int maxInd = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<size&&arr[left]>arr[maxInd]){
            maxInd = left;
        }
        if(right<size&&arr[right]>arr[maxInd]){
            maxInd = right;
        }
        if(maxInd!=i){
            //Sweap
            int temp  =arr[i];
            arr[i] = arr[maxInd];
            arr[maxInd] = temp;
            heapifyMax(arr,maxInd,size);
        }
    }
    public static void heapifyMin(int arr[],int i,int size){
        int minInd = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<size&&arr[left]<arr[minInd]){
            minInd = left;
        }
        if(right<size&&arr[right]<arr[minInd]){
            minInd = right;
        }
        if(minInd!=i){
            //Sweap
            int temp  =arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
            heapifyMax(arr,minInd,size);
        }
    }
    public static void heapSortAcending(int arr[]){
        int n= arr.length;
        //Step 1 : Build max Heap
        for(int i = n/2;i>=0;i--){
            heapifyMax(arr,i,n);
        }

        //Step 2: PUsh largest aqt the end of the heap ,
        // And in the calling of heapify we think that the last elemnent is remove from heap so call for n-1
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapifyMax(arr,0,i);
        }

    }
    public static void heapSortDecending(int arr[]){
        int n= arr.length;
        //Step 1 : Build max Heap
        for(int i = n/2;i>=0;i--){
            heapifyMin(arr,i,n);
        }

        //Step 2: PUsh largest aqt the end of the heap ,
        // And in the calling of heapify we think that the last elemnent is remove from heap so call for n-1
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapifyMin(arr,0,i);
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        heapSortAcending(arr);
        System.out.println("Heap sort in the acending order!!");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);;
        }
        heapSortDecending(arr);
        System.out.println("Heap sort in the Decending order!!");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);;
        }
    }
}
