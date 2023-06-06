package com.company;

public class Practice_Set_05 {
    public static void main(String[] args) {
        /*Write a java program to formet the following letter using escape sequence character
        *   letter  = "Dear Harry, This Java course is nice. Thanks*/
        String letter  = "Dear Harry, This Java course is nice. Thanks";
        String newletter = "Dear Harry,\n\t This Java course is nice.\n" +
                "Thanks";
        System.out.println("String after the formating::");
        System.out.println(newletter);
    }
}
