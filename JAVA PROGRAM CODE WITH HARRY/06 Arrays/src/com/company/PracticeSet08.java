package com.company;

public class PracticeSet08 {
    public static void main(String[] args) {
        /*Write a java program to find whether an array is sorket or not*/
        int []array = {1,2,3,5,45,12,54};
        boolean Issorket = true;
        for (int i=0;i< array.length-1;i++)
        {
            if (array[i]>array[i+1])
            {
                Issorket=false;
                break;
            }
        }
        if (Issorket)
        {
            System.out.println("Yes , Array is a sorket array!!");
        }
        else
        {
            System.out.println("No, Array is not a sorket array!!");

        }
    }
}
