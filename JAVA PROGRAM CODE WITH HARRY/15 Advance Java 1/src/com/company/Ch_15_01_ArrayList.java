package com.company;

import java.util.*;
public class Ch_15_01_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(23);
        l1.add(12);
        l1.add(43);
        l1.add(22);
        l1.add(4);
        System.out.println(l1);
//        ----------<<<<<<<<<< It's add elements in the continueous manner.
for (int i=0;i<l1.size(); i++)
{
    System.out.print(l1.get(i));
    System.out.print(" ,");
}
//------------------<<<<<<<<<<<<<<<< We can add element at the specific position of the array like this
        l1.add(4,63424);
l1.add(5,2434);
l1.add(6,53434);
l1.add(7,3544);
        System.out.println("\nArray elements after add element at the specific postion!!!");

        for (int i=0;i<l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(" ,");
        }
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(21);
        l2.add(223);
        l2.add(1232);
        l2.add(423);
        l2.add(222);
        l2.add(24);
//        l1.addAll(l2);
//        It will add elements after l1 element, If you want to aad element at the specific position then given index
//        number
        l1.addAll(3,l2);
        System.out.println("\nArray elements after concanate l2 !!");
        for (int i=0;i<l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(" ,");
        }
        System.out.println("");
        System.out.println(l1.contains(24));
        System.out.println(l1.indexOf(423));
        l1.clear();
        System.out.println("\nArray elements after clear !!");
        for (int i=0;i<l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(" ,");
        }
    }

}
