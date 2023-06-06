package com.company;
import java.util.Scanner;
public class PracticeSet06 {
    public static void main(String[] args) {
        /*Write a java program to find out the type of the website from the url
        * .com ---- Comertial wevsite
        * .org----- Orgaingation Website
        *  .in----- Indian Website*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website site!!!");
        String web = sc.next();
        if (web.endsWith(".com")) {
            System.out.println("This is an Commercial Website");
        }
        else if (web.endsWith(".org")) {
            System.out.println("This is an Organization  Website");
        }
        else if (web.endsWith(".in")) {
            System.out.println("This is an Indian Website");
        }

    }
}
