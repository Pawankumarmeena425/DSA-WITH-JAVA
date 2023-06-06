package com.company;

public class Question_12_CheckArrayIsSortedOrRotated {
    public static boolean arraySorted(int arr[]){
        int min=  Integer.MAX_VALUE;
        int minpos=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
                minpos=i;
            }
        }
        for (int i=minpos;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        for (int i=minpos-1;i>0;i--){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,4,8,1,2,3};
        boolean b = arraySorted(arr);
        if (b==true){
            System.out.println("Array is Sorted and Rotated !!! ");
        }
        else{
            System.out.println("Array is not Sorted and Rotated !!! ");
        }
    }
}
