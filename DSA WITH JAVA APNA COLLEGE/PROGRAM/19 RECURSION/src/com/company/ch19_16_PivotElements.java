package com.company;

public class ch19_16_PivotElements {
    public static int pivotElements(int arr[],int si, int ei){
        if (si>ei){
            return -1;
        }
        int mid=   si+(ei-si)/2;
        if (arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
            return mid;
        }
        else if(arr[mid]>arr[0]){
            si = mid+1;
        }
        else{
            ei =mid;
        }
        return pivotElements(arr, si,ei);
    }
    public static void main(String[] args) {
        int arr[]={7,90,1,2,3,4};
        System.out.println(pivotElements(arr,0,arr.length-1));
    }
}
