package com.company;

public class ch19_17_SortingUsingRecursion {
    public static void bubbleSort(int arr[],int n){
        if (n==0){
            return;
        }
        for (int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSort(arr,n-1);
    }

    public static void selectionSort(int arr[],int i){
        if (i==arr.length-1){
            return;
        }
        int minpos = i;
        for (int j=i+1;j<arr.length;j++){
            if (arr[minpos]>arr[j]){
                minpos = j;
            }
        }
        int temp = arr[i];
        arr[i]=arr[minpos];
        arr[minpos]=temp;
    selectionSort(arr,i+1);
    }

    public static void insertionSort(int arr[],int i){
        if (i==arr.length){
            return;
        }
        int temp = arr[i];
        int cp=i;
        for (int j=i-1;j>=0;j--){
            if (temp<arr[j]){

                arr[cp]=arr[j];
                arr[j]=temp;
                cp=j;

            }
        }
        insertionSort(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,1,5,9,7,2,1};
//        bubbleSort(arr,arr.length);

//        selectionSort(arr,0);
        insertionSort(arr,1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
