package com.company;
import java.util.*;
public class LeetcodePractice {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb  = new StringBuilder(s);
        StringBuilder tb = new StringBuilder (t);
        while(sb.indexOf("#")>=0||tb.indexOf("#")>=0){
            if(sb.indexOf("#")>=0){
                int ind = sb.indexOf("#");
                sb.deleteCharAt(ind-1);
                sb.deleteCharAt(ind-1);
            }
            if(tb.indexOf("#")>=0){
                int ind  = tb.indexOf("#");
                tb.deleteCharAt(ind-1);
                tb.deleteCharAt(ind-1);
            }
        }
        return sb==tb;
    }
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }
}
