package com.company;

import java.util.Scanner;

public class Ch_15_00_StringBasic {
    public static void main(String[] args) {
        char chars[]=new char[20];
char ch  ='A';
//ch = (char) (ch-'A'+'a');
//        System.out.println(ch);
//ch = (char)(ch-'a'+'A');
ch = (char)(ch+32);
        System.out.println(ch);
        ch  =(char)(ch-32);
        System.out.println(ch);
    }
}
