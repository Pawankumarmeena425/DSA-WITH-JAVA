package com.company;

public class ch19_05_FirstOccurence {
    public static int occurence(int arr[],int si, int key){

        if (si==arr.length){
            return -1;
        }
        if (arr[si]==key){
            return si;
        }
        else {

            int index = occurence(arr,si+1,key);
            return index;
            }

    }
    public static void main(String[] args) {
        int arr[]={2,4,5,5,6,7,8,2,3,5,9};
       int index=  occurence(arr,0,8);
       if (index==-1){
           System.out.println("key is not availabe in the array!!");
       }
        else
       {
           System.out.println("key is availabe at index "+index);
       }
    }
}
