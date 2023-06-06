package com.company;

public class StringPoolAreaVSHeapArea {
    public static void main(String[] args) {
        String animal1 = new String("Dog");
        String animal2 = "Cat";
        String animal3 = "Cat";
        String animal4 = new String("Dog");
        System.out.println(animal2==animal3);

        System.out.println(animal1.equals(animal4));
    }
}
