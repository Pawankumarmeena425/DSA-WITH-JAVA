package com.company;
import java.util.*;
public class ch_14_10_Allocate_Books {
    public static boolean isPossible(int arr[] , int m , int maxPage){
        int sum = 0;
        for(int i=arr.length-1;i>=0;i--){
            sum += arr[i];
            if(sum>maxPage){
                m--;
                sum=0;
                i++;
                // we don't require to take care , if any students is remaining and he is not alloct any books .
                // Means other students get more page , in the maxPage condition . so we can assing this book that studetns which not get any book
            }
            if(m==0 && i>0){
                return false;
            }
        }
        return m>=0; // means by allocating the all page book to the m students  , it triverse complete array
    }
    public static int findPages(int nums[], int m) {
        // Write your code here.
        int sum=0;
        int min  =Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
            min = Math.min(min,nums[i]);
        }
        // now our answer will be lies
        int low = min;
        int high = sum;
        int ans =-1;
        System.out.println(low+" "+high);
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(nums , m,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int pages[]={25, 46 ,28 ,49 ,24};
        int m = 4;
        System.out.println(findPages(pages,m));
    }
}
