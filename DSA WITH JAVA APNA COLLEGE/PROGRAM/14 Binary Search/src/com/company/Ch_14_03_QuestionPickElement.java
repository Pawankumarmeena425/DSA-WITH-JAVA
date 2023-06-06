package com.company;

public class Ch_14_03_QuestionPickElement {
    public static int pickElements(int arr[]){
        int start  = 0;
        int  end = arr.length-1;
        int max;
while(start<=end){
    int mid  = start+(end-start)/2;
    if (arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1]){
        max  =arr[mid];
        return max;
    }
    else if (arr[mid]<arr[mid+1]){
        start = mid+1;
    }
    else if(arr[mid]>arr[mid+1]){
        end = mid-1;
    }
}
return -1;
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,9,10,12,24,25,3,2,1};
       int val= pickElements(arr);
        System.out.println(val);
    }
}
