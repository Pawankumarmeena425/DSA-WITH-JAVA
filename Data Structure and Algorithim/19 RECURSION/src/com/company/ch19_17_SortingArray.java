package com.company;

public class ch19_17_SortingArray {
    public static void bubbleSort(int arr[]){

        for (int turn =0;turn<arr.length-1;turn++){
            for (int j=0;j<arr.length-1-turn;j++){
                if (arr[j]>arr[j+1]){
//                    Sweaping
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]){

        for (int i=0;i<arr.length-1;i++){
            int minpos=i;
//            Tryverse in the unsorted part
            for (int j=i;j<arr.length-1;j++){
                if (arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
//            Shifthing smallest elements at first
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=arr[minpos];
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int temp = arr[i];
            int cp=i;
            for (int j=i-1;j>=0;j--){

                if (temp<arr[j]){

                    arr[cp]=arr[j];
                    arr[j]=temp;
                    cp = j;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,9,56,3,43,4,23,2,3,23,2,32,32,323,2,3,23,2,3,2,32,1};
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
    }
}
