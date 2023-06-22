package com.company;

public class ch19_06_LastOccurence {
    public static int lastOccurence(int arr[],int ei,int key){
        if (ei==-1){
            return -1;
        }
        if (arr[ei]==key){
            return ei;
        }
        return lastOccurence(arr,ei-1,key);
    }
    public static void main(String[] args) {
        int arr[]={12,4,5,5,6,7,8,2,3,5,9,5};
        int index=  lastOccurence(arr,arr.length-1,12);
        if (index==-1){
            System.out.println("key is not availabe in the array!!");
        }
        else
        {
            System.out.println("key is availabe at index "+index);
        }
    }
}
