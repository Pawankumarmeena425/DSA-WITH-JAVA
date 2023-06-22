package com.company;

public class Ch_13_01_SelectionSort {
    public static void selectionSort(int num[]){
        int min =Integer.MAX_VALUE;
        int count =0;
        for (int i=0;i<num.length-1;i++){
            min = num[i];
          int  minpos=i;

            for (int j=i+1;j<num.length;j++){
                if (num[j]<min){
                   minpos = j;

                }
            }
            int temp = num[i];
            num[i]=num[minpos];
            num[minpos]=temp;


        }
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
//        int num[]={5,4,1,3,2};
        selectionSort(num);
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
