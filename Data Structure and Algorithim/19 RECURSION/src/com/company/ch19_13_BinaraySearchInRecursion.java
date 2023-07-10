package com.company;

public class ch19_13_BinaraySearchInRecursion {
    public static int binarySearch(int arr[],int si, int ei,int key){

        int mid=si+(ei-si)/2;
        if(si>ei){
            return -1;
        }
        if (arr[mid]==key){
            return mid;
        }
        else if (arr[mid]>key){
            return binarySearch(arr,si,mid-1,key);
        }
        else {
            return binarySearch(arr,mid+1,ei,key);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,5,7,89,};
        System.out.println(binarySearch(arr, 0,arr.length-1,89));
    }
}
