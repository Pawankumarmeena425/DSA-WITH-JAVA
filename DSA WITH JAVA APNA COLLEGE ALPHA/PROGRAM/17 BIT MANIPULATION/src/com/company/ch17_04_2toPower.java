package com.company;

public class ch17_04_2toPower {
    public static boolean power (int num) {
        return ((num & num - 1) == 0);
    }
    public static void main(String[] args) {
        System.out.println(power(5));
    }
}
