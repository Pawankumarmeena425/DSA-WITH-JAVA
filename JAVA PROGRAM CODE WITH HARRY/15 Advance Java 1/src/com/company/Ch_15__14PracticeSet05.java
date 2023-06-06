package com.company;

import java.util.HashSet;
import java.util.Set;

public class Ch_15__14PracticeSet05 {
    public static void main(String[] args) {
//        Set <Integer> st  =new Set<Integer>();
//        WE can't create object of the Set directly as it is an abstract(Interface) class
        HashSet<Integer> s = new HashSet<Integer>();
        s.add(43);
        s.add(33);
        s.add(443);
        s.add(23);
        System.out.println(s);
    }
}
