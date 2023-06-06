package com.company;
import java.util.Scanner;
public class Practice_Set_03 {
    public static void main(String[] args) {
        /*Write a java Program to fill in a letter template with looks like below
        * letter  = "Dear<|name|> , Thanks a lot"
        * Replace <|name|> with a string(some name)*/
        String letter = "Dear <|name|> , Thanks a lot";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = s.nextLine();
        String replace = letter.replace("<|name|>",name);
        System.out.println("String After replace the name::");
        System.out.println(replace);
    }
}
