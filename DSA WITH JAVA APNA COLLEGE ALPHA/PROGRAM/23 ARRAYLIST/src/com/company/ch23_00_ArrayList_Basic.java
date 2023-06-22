package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ch23_00_ArrayList_Basic {
        public static void main(String[] args) {
                ArrayList<Integer> roll = new ArrayList<>();
                // ****Add Opertaion --O(1)****
                roll.add(3);
                roll.add(4);
                roll.add(5);
                roll.add(6);
                roll.add(7);
                // It will add elements at the end of the array
                System.out.println(roll);

                // ----->>>> Another method for add operation --- O(n)
                roll.add(0, 2);
                roll.add(3, 9);
                // It will add element at the given index and shift array right side
                System.out.println(roll);

                // *******Get Element from ArrayList --- O(1)******
                System.out.println(roll.get(3));

                // ********Remove Elements from Arraylist ----O(n)**********
                roll.remove(2);
                System.out.println(roll);

                // *******Set Elements in the ArrayList ------O(n)-----********
                roll.set(1, 321);
                System.out.println(roll);

                // ******* Contains Elements ---O(n)******
                System.out.println(roll.contains(321));
                System.out.println(roll.contains(234));

                System.out.println("Size of ArrayList is:: " + roll.size());
                // Print elements using loop
                for (int i = 0; i < roll.size(); i++) {
                        System.out.print(roll.get(i) + " ");
                }
                System.out.println();

                // Print ArrayList in the Reverse Order
                for (int i = roll.size() - 1; i >= 0; i--) {
                        System.out.print(roll.get(i) + " ");
                }
                System.out.println();

                // Find Maximum element in the ArrayList
                int max = 0;
                for (int i = 0; i < roll.size(); i++) {
                        if (roll.get(i) > max) {
                                max = roll.get(i);
                        }
                }
                System.out.println("Maximum element in the arraylist is ::" + max);

                System.out.println("ArrayList before sweap number::");
                System.out.println(roll);
                // Sweap two elements in the ArrayList
                // Sweap : index1=1,index2=3;

                int temp = roll.get(1);
                roll.set(1, roll.get(3));
                roll.set(3, temp);
                System.out.println("ArrayList After sweap two elements::");
                System.out.println(roll);

                // Sort an ArrayList in Acending order
                Collections.sort(roll);
                System.out.println("Arraylist after Sorting:::");
                System.out.println(roll);
                // Sort ArrayList in the Decending order
                Collections.sort(roll, Collections.reverseOrder());
                System.out.println("Arraylist in the Decending order::");
                System.out.println(roll);
        }
}
