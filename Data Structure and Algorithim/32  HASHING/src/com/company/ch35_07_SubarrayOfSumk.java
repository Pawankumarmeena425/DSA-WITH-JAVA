package com.company;
import java.util.*;

public class ch35_07_SubarrayOfSumk {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);//for first time sum
        int sum=0;
        int count=0;
        for(int j=0;j<arr.length;j++){
            sum = sum+arr[j];
            if(map.containsKey(sum-k)){
                count = count+map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }

}
