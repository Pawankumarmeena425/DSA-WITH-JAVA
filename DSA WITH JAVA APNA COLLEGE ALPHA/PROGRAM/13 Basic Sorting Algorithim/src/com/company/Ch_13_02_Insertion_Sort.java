package com.company;

public class Ch_13_02_Insertion_Sort {
    public static void InsertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0)
           {
//            Shifting Condition
                if (temp<arr[j]){
                   arr[j+1]=arr[j];
                }
//                If temp variable is not small, it means no one elements will be greater then temp . Because arry is
//                already sorted:::::
                else{
                    break;
                }
                j--;
            }
            arr[j+1]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[]={2,5,6,3,4,8,9,1};
        InsertionSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
