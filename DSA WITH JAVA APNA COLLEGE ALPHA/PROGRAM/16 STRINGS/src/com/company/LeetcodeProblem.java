package com.company;

import java.util.Scanner;

public class LeetcodeProblem {
    public static String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder(s);
        int count=0;
        while(true){
            count =0;
            for(int i=0;i<sb.length();i++){
                if(i<sb.length()-1&&sb.charAt(i)==sb.charAt(i+1)){
                    count++;
                    sb.delete(i,i+2);
                    System.out.println(sb);
                    break;
                }
            }
            if(count==0){
                return sb.toString();

            }
        }

    }
    public static void main(String[] args) {
//    String s1 = "abcdeabcdx";
//    String s2 = "abcdxabcde"
//       ;
        String s = "aaaaaaaa";
        System.out.println(removeDuplicates(s));
    }
}
