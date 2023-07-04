package com.company;

public class Ch_14_06_Question_SearchingInRoatedSortedArrya {
    public static int pivotIndex(int nums[]) {
        if (nums.length == 1 || nums[0] < nums[nums.length - 1]) {
            return 0;
        }

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } else if (nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0; // it not make any sense , it only for safe from error
    }
    public static  int search(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        } else if (nums.length == 1 && nums[0] != target) {
            return -1;
        }
        int pivot = pivotIndex(nums); // lowest value index in  the nums
        if (target == nums[pivot]) {
            return pivot;
        }
        int low = 0, high = nums.length - 1;

        if (nums[0] > nums[nums.length - 1]) { // if this condition is true , means it is not rotated  ,  and for that we already declare low and high
            if (target >= nums[0]) { // means exist in the left part
                high = pivot - 1;
            } else {
                low = pivot + 1;
            }
        }

        // now apply simple searching
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2 ,4, 5, 6, 8, 9, 1};
        int k=1;
        int val = search(arr,k);
        if (val==-1){
            System.out.println(k+" is not available in the array!!");
        }
        else{
            System.out.println( k+" is available at the index "+val);
        }
    }
}
