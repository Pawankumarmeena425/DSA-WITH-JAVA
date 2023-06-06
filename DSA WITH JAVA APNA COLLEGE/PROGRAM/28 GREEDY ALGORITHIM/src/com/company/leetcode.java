package com.company;
import java.lang.reflect.Array;
import java.util.*;
public class leetcode {
    public static void  sortByBits(int[] arr) {
        int count[][] = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int c =0 ;
            count[i][0]=num;
            while(num!=0){
                if((num&1)!=0){
                    c++;
                }
                num = num>>1;
            }
            count[i][1]=c;
        }
        Arrays.sort(count,Comparator.comparingDouble(o->o[1]));//sort according to the 1st column
        for(int i=0;i<arr.length;i++){
            arr[i] = count[i][0];
        }
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
    }
    public static void main(String[] args) {
int arr[]={1024,512,256,128,64,32,16,8,4,2,1};
sortByBits(arr);
    }
}
