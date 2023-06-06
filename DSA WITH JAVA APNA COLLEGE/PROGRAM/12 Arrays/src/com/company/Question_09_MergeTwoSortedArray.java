package com.company;

public class Question_09_MergeTwoSortedArray {
    public static void mergeArray(int arr1[],int arr2[]){
        int arr3[]=new int[arr1.length+arr2.length];
        System.out.println(arr3.length);
        int v1=0,v2=0;
        for (int i=0;v1<arr1.length||v2<arr2.length;i++){
            if (v2<arr2.length&&arr1[v1]>arr2[v2]){
                arr3[i]=arr2[v2];
                v2++;
         }
            else{
                arr3[i]=arr1[v1];
                v1++;
            }

        }
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6};
        mergeArray(arr1,arr2);
    }
}
