package com.company;

import java.util.HashSet;

public class Ch_15_04_HashSet {
    public static void main(String[] args) {
        HashSet <Integer> h1 = new HashSet<>(10,0.5f);
//        Load Factor in the Hashset take only Floating values, So we write 0.5f
        h1.add(2);
        h1.add(5);
        h1.add(7);
        h1.add(1);
        h1.add(9);

        System.out.println(h1);

    }
}
