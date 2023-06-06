package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ch_15_Linklist {
    public static void main(String[] args) {
//        Arraylist and Linklist both are similer, But Intersion and delection operation is fast in the Linklist.
//        Linklist can use Arraylist all method, but there are something additional menthod in the linklist.
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(23);
        l1.add(12);
        l1.add(43);
        l1.add(22);
        l1.add(4);
//        ----------<<<<<<<<<< It's add elements in the continueous manner.
        System.out.println(l1);
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

        l1.addLast(324234);
        l1.addFirst(24242);
//        These method are not available in the Arraylist
        System.out.println("\nLinkedList elements after perfrom some addtional method");
        for (int i=0;i<l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(" ,");
        }
    }
}
