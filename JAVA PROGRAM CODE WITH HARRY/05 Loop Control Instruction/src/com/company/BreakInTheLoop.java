package com.company;

public class BreakInTheLoop
{
    public static void main(String[] args) {
//        Break using in the loop
        for (int i=0; i<6;i++)
        {
            System.out.println(i);
            System.out.println("Java is a great language");
            if (i==3){
                System.out.println("Ending the loop::");
                break;
            }
        }
        System.out.println("We are outside the loop");
    }
}
