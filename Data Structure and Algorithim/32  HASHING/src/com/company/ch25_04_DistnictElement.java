package com.company;

import java.util.HashSet;

public class ch25_04_DistnictElement {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8,4,3,1,2,3,1};
        HashSet<Integer> hs  = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }
}
