package com.company;

public class Ch_14_04_Question_Pivot_Index {
    public static int pivot(int nums[]){

    int start = 0;
    int end = nums.length - 1;
    int mid = start + (end - start) / 2;
    int pivot = 0;
        while(start<nums.length)

    {
        int lsum = 0;
        int rsum = 0;
        int i = mid - 1;
        while (i >= 0) {
            lsum = lsum + nums[i];
            i--;
        }
        int j = mid + 1;
        while (j < nums.length) {
            rsum = rsum + nums[j];
            j++;
        }
        if (lsum == rsum) {
            pivot = mid;
            return pivot;

        } else if (lsum > rsum) {
            mid = mid - 1;
        } else if (rsum > lsum) {
            mid = mid + 1;
        }
        start++;

    }


        return-1;
}
    public static void main(String[] args) {
        int nums[]={-1,-1,-1,-1,-1,-1};
       int index= pivot(nums);
        System.out.println(index);
    }
}
