package com.company;

import java.util.Comparator;
import java.util.TreeMap;

public class ch35_08_PQ_02 {
    public static void sum(int arr[],int target){
        TreeMap<Integer,Integer> map  =  new TreeMap<>(Comparator.reverseOrder());
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        int ans[]=new int[2];
        for(Integer key:map.keySet()){
            if(map.get(key)>target){
                continue;
            }
            else{

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,5};
    }
}
