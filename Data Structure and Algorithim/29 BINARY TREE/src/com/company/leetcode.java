package com.company;
import java.util.*;
public class leetcode {
   public static int maxsum(int n1,int n2,int n3,int k){
       int sum=0;
       if(k>=n1){
           sum = sum+n1;
           k = k-n1;
       }
       else{
           sum=  sum+k;
           k=0;
       }
       if (k>=n2){
           k = k-n2;
       }
       else{
           k = 0;
       }
       if(k>=n3){
           sum = sum-k;
           k = k-n3;
       }
       else{
           sum = sum-k;
           k=0;
       }
       return sum;
   }
    public static void main(String[] args) {
        System.out.println(maxsum(3,2,0,4));


    }
}
