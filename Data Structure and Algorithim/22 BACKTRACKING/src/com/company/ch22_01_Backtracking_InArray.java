package com.company;

public class ch22_01_Backtracking_InArray {
    public static void changeArray(int arr[],int i,int val){
//        Base Case
        if(i==arr.length){
            printArr(arr);
        return ;
        }
//        Recursion
        arr[i]=val;
        changeArray(arr,i+1,val+1);
//        Backtracking step
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        Set array element by increment value by 1, then decrement by 2
        int arr[]=new int [5];
        changeArray(arr, 0,1);
        printArr(arr);

    }
}
