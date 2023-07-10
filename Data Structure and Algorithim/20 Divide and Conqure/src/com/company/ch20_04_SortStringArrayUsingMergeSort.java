package com.company;

import javax.swing.*;

public class ch20_04_SortStringArrayUsingMergeSort {
    public static void merge(String arr[],int si,int ei, int mid){
        int i = si;
        int j = mid+1;
        int k=0;
        String temp[]=new String[ei-si+1];
        while (i<=mid&&j<=ei){
          int val = arr[i].compareTo(arr[j]);
          if (val>=0){
              temp[k]=arr[j];
              j++;
          }
          else{
              temp[k]=arr[i];
              i++;
          }
          k++;
        }

//        Copy Remaining part
        while (i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while (j<=ei){
            temp[k]=arr[j];
            j++;
            k++;
        }
//        Copy temp array element in the original array
        for (i=si,k=0;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return;
    }
    public static void mergeSort(String arr[],int si, int ei){
        if (si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
//        Left Part
        mergeSort(arr, si,mid);
//        Right Part
        mergeSort(arr, mid+1,ei);
        merge(arr, si, ei, mid);
    }
    public static void printarray(String arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        String  arr[] = { "sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0,arr.length-1);
        printarray(arr);
    }
}
