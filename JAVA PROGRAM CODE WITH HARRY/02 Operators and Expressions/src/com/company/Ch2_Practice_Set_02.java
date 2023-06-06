package com.company;

public class Ch2_Practice_Set_02 {
    public static void main(String[] args) {
        /*Write a java program to encrypt a grade by adding 8 to it.Decrypt it to show the correct grade
         */
        char grade = 'B';
        grade +=8;
        System.out.println("Given Grade!!"+grade);
        grade -=8;
        System.out.println("Right Grade!!"+grade);
    }
}
