package com.company;
import java.util.Scanner;
public class Ch1_Practice_Set_04 {
    public static void main(String[] args) {
        /*Write a java program to convert kilometers to miles*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers!!");
        float dis_km = sc.nextFloat();
        float dis_mile;
        dis_mile = dis_km*0.621371f;
        System.out.println("Distance in the miles!! " +dis_mile);
    }
}
