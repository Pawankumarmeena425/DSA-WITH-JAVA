package com.company;

public class ForEachLoop {
    public static void main(String[] args) {


        int[] marks = {3, 2, 5, 2, 5, 2, 35, 2, 3, 4};
//    ""We can create array of float , character and String as well as integer
//    Dislaying the array using the for loop
        System.out.println("Printing array element using the for loop!!");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing array element using the for each loop !!");
        for (int i = marks.length-1 ; i >=0; i--) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing array element using the for-each loop in reverse order!!");
        for (int element:marks) {
            System.out.println(element);
        }
    }
}
