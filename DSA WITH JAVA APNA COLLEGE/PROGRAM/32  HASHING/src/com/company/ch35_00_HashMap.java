package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ch35_00_HashMap {
    public static void main(String[] args) {
        HashMap<String ,Integer> hm = new HashMap<>();
        hm.put("India",34);
        hm.put("Pakisthan",234);
        hm.put("England",342);
        hm.put("Russia",32);
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        System.out.println(keys);;
        for (String k:keys
             ) {
            System.out.println("key = "+k+", Value = "+hm.get(k));
        }
        System.out.println(hm.entrySet());

    }
}