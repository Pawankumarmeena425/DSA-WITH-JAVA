package com.company;

public class ch19_04_ArraySorted {
    public static boolean sorted(int arr[],int si){
        if (si==arr.length-1){
            return true;
        }
        if (arr[si]<=arr[si+1]){
            boolean b = sorted(arr,si+1);
            return b;
        }
else {
    return false;
        }



    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(sorted(arr,0));

    }
}
