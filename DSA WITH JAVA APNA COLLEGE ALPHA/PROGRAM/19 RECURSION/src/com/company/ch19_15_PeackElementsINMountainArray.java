package com.company;

public class ch19_15_PeackElementsINMountainArray {
    public static int  peakElements(int arr[],int si,int ei){

        if (si>ei) {
        return -1;
        }
        int mid = si+(ei-si)/2;
        if (arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1]){
            return mid;
        }
       else  if (arr[mid]<arr[mid+1]){
            si=  mid+1;
        }
        else {
            ei=mid;
        }
      return peakElements(arr,si,ei);
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,9,7,6,4,2,0};
        System.out.println( peakElements(arr,0,arr.length-1));;
    }
}
