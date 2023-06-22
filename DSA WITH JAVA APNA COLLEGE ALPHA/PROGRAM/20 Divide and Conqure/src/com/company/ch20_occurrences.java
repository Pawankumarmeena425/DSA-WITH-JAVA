package com.company;

public class ch20_occurrences {
    public static void occurrences(int arr[],int si, int key){
        if (si==arr.length){
            return ;
        }
        if (arr[si]==key){
            System.out.print(si);
        }
        occurrences(arr,si+1,key);
    }
    public static void main(String[] args) {

        int arr[]={1,3,4,5,3,2,3,4,5,3,2,3,3};
        occurrences(arr,0,3);
    }
}
