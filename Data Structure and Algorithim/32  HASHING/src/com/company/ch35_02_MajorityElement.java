package com.company;
import java.util.*;
public class ch35_02_MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,2,2,2};
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key  = arr[i];
//            if(hm.containsKey(key)){// update frequency
//
//                hm.put(key,hm.get(key)+1);
//            }
//            else{
//                hm.put(key,1);
//            }

            // 2nd way shortcut
            hm.put(key,hm.getOrDefault(key,0)+1); // if key exit then give that frequency , if not exit then defaul value =0
        }
      Set<Integer> keys = hm.keySet();
        for (Integer k:keys
             ) {
            if(hm.get(k)>arr.length/3){
                System.out.println(k);
            }
        }

        // 2nd way for iteration
        for(Integer key: hm.keySet()){
            if(hm.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}
