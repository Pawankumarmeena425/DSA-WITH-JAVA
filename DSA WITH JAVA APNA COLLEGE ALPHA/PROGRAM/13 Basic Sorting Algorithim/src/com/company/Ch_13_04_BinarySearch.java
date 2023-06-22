package com.company;

public class Ch_13_04_BinarySearch {
    public static int binarySearch(int arr[],int key){

        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            if (key==arr[mid]){
                return mid;
            }
//            Jump to the right part
            else if(key>arr[mid]){
                start = mid+1;
            }
//            Jump to the left part
            else if(key<arr[mid]){
                end = mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,8,9};
        int key  = 12;
        int val=binarySearch(arr,key);
        if (val==-1){
            System.out.println(key+ " is not available in the array!!");
        }
        else{
            System.out.println(key+ " is available at the index " +val+" in the array!!");
        }
    }
}
