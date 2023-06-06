package com.company;

public class Practice_Set_04 {
    public static void main(String[] args) {
        /*Write a java program to detect double and triple spaces in a string*/
        String str = "This string contains double and  triple spaces";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
    }
}
