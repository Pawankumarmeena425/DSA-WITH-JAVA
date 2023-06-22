package com.company;

import java.util.ArrayList;

public class ch23_03_PairsSum {
    public static ArrayList<Integer> pairsSum(ArrayList<Integer>nums,int target){
        ArrayList<Integer> list = new ArrayList<>();
    int min=0;
    int max=nums.size()-1;
    while(min<=max){
        int sum = nums.get(min)+nums.get(max);
        if(sum==target){
            list.add(min);
            list.add(max);
            break;
        }
        else if(target>sum){
            min++;
        }
        else{
            max--;
        }
    }
    return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1;i<=10;i++){
            nums.add(i);
        }
        ArrayList<Integer> result = pairsSum(nums,15);

        System.out.println(result);
    }
}
