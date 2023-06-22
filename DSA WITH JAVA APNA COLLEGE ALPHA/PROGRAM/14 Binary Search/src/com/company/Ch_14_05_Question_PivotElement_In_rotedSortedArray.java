package com.company;

public class Ch_14_05_Question_PivotElement_In_rotedSortedArray {
    public static int pivotElement(int arr[]){
        int s=0,e= arr.length-1;
        int mid=0;
        while (s<e){
             mid = s+(e-s)/2;
//            if (arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]||arr[mid]<arr[mid-1]&&arr[mid]<arr[mid+1]){
//                return mid;
//            }
////            else if(arr[mid]<arr[mid-1]&&arr[mid]<arr[mid+1]){
////                return mid;
////            }
         if(arr[mid]>=arr[0]){
                s  =mid+1;
            }
            else{
                e = mid;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
//        int  arr[]={7,9,11,12,13,15,1,2,3,4,5,6,};
        int arr[]={2 ,4, 5, 6, 8, 9, 1};
      int val=  pivotElement(arr);
      if (val==-1){
          System.out.println("Pivot element not available in the array!!");
      }
      else{
          System.out.println( "Pivot element available at the index "+val);
      }
    }
}
