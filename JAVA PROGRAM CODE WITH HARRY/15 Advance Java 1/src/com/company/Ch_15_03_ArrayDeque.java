package com.company;

import java.util.ArrayDeque;

public class Ch_15_03_ArrayDeque {
    public static void main(String[] args) {
//        Array Deque is similer like to the arraylist and linklist. But we can perform insertion and deletion in the
//        Array Deque at the start or End.

        ArrayDeque<Integer> d1=  new ArrayDeque<>();
        d1.add(2);
        d1.add(3);
        d1.add(4);
        d1.add(5);
        d1.add(8);
        d1.addFirst(433);
        System.out.println(d1);
        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());


    }
}
