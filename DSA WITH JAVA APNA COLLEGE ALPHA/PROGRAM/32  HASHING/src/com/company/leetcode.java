package com.company;
import java.util.*;
public class leetcode {
    public static List<List<Integer>> subsetsArrays(int nums[],int i, List<Integer>  list, List<List<Integer>>mainList){
        if(i==nums.length){
            //Shallow copy
            mainList.add(new ArrayList<>(list));

            return mainList;
        }
// Exclude call

        subsetsArrays(nums,i+1,list,mainList);
        list.add(nums[i]);
        subsetsArrays(nums,i+1,list,mainList);//Include call
        list.remove(list.size()-1);//Remove require last element , for exclude call

        return mainList;
    }
    public static void subsets(int[] nums) {
        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
       mainlist = subsetsArrays(nums,0,list,mainlist);
        System.out.println(mainlist);
    }
    public static void main(String[] args) {
   int arr[]={1,2,3};
   subsets(arr);
    }
}
