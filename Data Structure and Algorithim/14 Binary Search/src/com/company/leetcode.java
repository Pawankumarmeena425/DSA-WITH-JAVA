package com.company;
import java.util.*;
public class leetcode {

    public static boolean isPossible(int nums[] , int length){
        if(length==1){
            return true;
        }
        int arr[] = new int[length];
        for(int i=0;i<length;i++){  // make subarray of length
            arr[i] = nums[i];
        }
        Arrays.sort(arr);

// Now check if all element frequency is equal to 1
        int i=0;
        for(;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                continue;
            }
            else{
                break;
            }
        }
        if(i==arr.length-1){
            return true;
        }

//we already for frequency with 1 , Now there exist another frequency .
        int freq1 = 0;

        int freq =1;
        int prev = 0;
        for(int j = 0;j<arr.length-1;j++){
            if(arr[j]==arr[j+1]){
                freq++;
            }
            else if(freq1>1){
                return false;
            }
            else{
                if(freq==1){
                    freq1++;
                }
                else{
                    if(prev==0){//for the first time
                        prev = freq;
                        freq = 1;
                    }
                    else if(prev!=freq){
                        return false;
                    }
                    else{
                        freq = 1;
                    }
                }
            }
        }

        int n = arr.length;
        if(arr[n-1]!=arr[n-2]&& freq1==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static int maxEqualFreq(int[] nums) {
        int low = 1, high = nums.length;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(nums,mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,5,3,3,5};
        System.out.println(maxEqualFreq(nums));

    }
}
