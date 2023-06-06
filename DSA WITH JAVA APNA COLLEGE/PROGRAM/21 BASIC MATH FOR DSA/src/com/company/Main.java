package com.company;

public class Main {
    public static  int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int odd=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%2!=0){
                    odd++;
                }
                if(odd==k){
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
	// write your code here
        int nums[] = {1,1,2,1,1};
        int k = 3;
        System.out.println(numberOfSubarrays(nums,k));
    }
}
