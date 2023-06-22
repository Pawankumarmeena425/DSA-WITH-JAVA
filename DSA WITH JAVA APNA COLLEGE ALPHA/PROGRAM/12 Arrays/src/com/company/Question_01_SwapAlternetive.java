package com.company;

public class Question_01_SwapAlternetive {
    public static void SwapAlternative(int arr[]){
////        int first=0;
////        int second=1;
//        int i=0;
//        while (i<arr.length/2){
//            int temp = arr[first];
//            arr[first]=arr[second];
//            arr[second]=temp;
//            first = first+2;
//            second = second+2;
//            i++;
//        }

        for (int i=0;i<arr.length;){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i=i+2;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,2,32,4,23,5};
        SwapAlternative(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
