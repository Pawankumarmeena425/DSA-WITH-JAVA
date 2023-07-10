package com.company;

public class BinarySearch {
    public static int search(int numbers[],int key){
int start =0;
int end = numbers.length-1;
while (start<=end){
    int mid = (start+end)/2;
    if (numbers[mid]==key){
        return mid;
    }
 else if (numbers[mid]>key){
       end = mid-1;
    }
 else {
     start = mid+1;
    }
}
return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key =123;
        int index =  search(numbers,key);
        if (index==-1){
            System.out.println(key + "are not available in the array !!");
        }
        else {
            System.out.println(key + " are available in the array at the position " + index+1);
        }
    }
}
