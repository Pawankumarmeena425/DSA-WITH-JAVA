
package com.company;
import java .util.*;
public class leetcode {
    public static boolean isEqual(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int reductionOperations(int[] nums) {
        int count = 0;
        while (!isEqual(nums)) {
            int max = Integer.MIN_VALUE;
            int smax = Integer.MIN_VALUE;
            int maxInd = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    maxInd = i;
                }

            }
            for(int i=0;i<nums.length;i++){
                if (nums[i] > smax && nums[i] < max) {
                    smax = nums[i];
                }
            }
            System.out.println(nums[maxInd]);
            nums[maxInd] = smax;

            count++;

        }

        return count;
    }
    public static void main(String[] args) {
            int nums[] = {5,1,3};
        System.out.println(reductionOperations(nums));
    }
}
