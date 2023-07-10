package com.company;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class ch25_00_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs  = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(5);
        hs.add(1);
        hs.add(2);
        hs.add(7);
        // 1st way usign iterator
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        // 2nd way using foreach
        for (Integer key :
                hs) {
            System.out.println(key);

        }
        int arr[]={2,53,6,3,7};

        TreeMap<Integer,Integer> tm = new TreeMap<>(Comparator.reverseOrder());
        for(int i=0;i<arr.length;i++){
            tm.put(arr[i],i);
        }
        for(Integer key:tm.keySet()){
            System.out.println(key+" , "+tm.get(key));
        }
    }
}
