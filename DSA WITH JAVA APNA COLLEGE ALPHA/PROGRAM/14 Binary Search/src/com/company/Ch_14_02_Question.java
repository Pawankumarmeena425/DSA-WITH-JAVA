package com.company;

public class Ch_14_02_Question {
//    public static int firstandLastIndex(int arr[],int key){
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start<=end){
//            int mid = start+(end-start)/2;
//            if (key==arr[mid]){
//                int temp = mid;
//                while (key==arr[mid]){
//                    mid--;
//                }
//                int first = mid;
//                mid = temp;
//                while (key==arr[mid]){
//                    mid++;
//                }
//                int last = mid;
//
//                int index[]={first,last};
//                return index;
//            }
////            Jump to the right part
//            else if(key>arr[mid]){
//                start = mid+1;
//            }
////            Jump to the left part
//            else if(key<arr[mid]){
//                end = mid-1;
//            }
//
//        }
//        return -1;
//    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,2,2,4,5,1,1,1,7,9};
        int key = 1;
        int start = 0;
        int end = arr.length-1;
int first=0,last=0;
int count=0;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (key==arr[mid]){

                int temp = mid;
                while (key==arr[mid]){
                    count++;
                    mid--;
                }
                 first = mid+1;
                mid = temp;
                count  = count-1;
                while (key==arr[mid]){
                    count++;
                    mid++;
                }
             last = mid-1;
break;
            }
//            Jump to the right part
            else if(key>arr[mid]){
                start = mid+1;
            }
//            Jump to the left part
            else if(key<arr[mid]){
                end = mid-1;
            }

        }
        if (count==0){
            System.out.println(key+ " is not  available in the array!!");
        }
        else {
            System.out.println(key + " is available in the array::\n Fist Index =  " + first + " \n Last Index = " + last);
        }
        System.out.println("total Number of Occurences of "+key+ " is "+count);
    }
}
