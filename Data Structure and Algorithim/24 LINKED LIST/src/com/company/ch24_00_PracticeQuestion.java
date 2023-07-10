package com.company;
import java.util.*;
public class ch24_00_PracticeQuestion{
    public static int countGoodSubstrings(String s) {
        String arr[]=new String[s.length()-2];
        for(int i=0;i<s.length()-2;i++){
            StringBuilder sb = new StringBuilder("");
            sb.append(s.charAt(i));
            sb.append(s.charAt(i+1));
            arr[i]=sb.toString();
        }
        int k=0;
        for(int i=2;i<s.length();i++){
            StringBuilder sb  = new StringBuilder("");
            sb.append(s.charAt(i));
            arr[k]=arr[k]+sb.toString();
            k++;
        }

        int count=0;
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            boolean b = true;
            for(int j=0;j<str.length()-1;j++){
                char ch = str.charAt(j);
                if(str.indexOf(ch,j+1)>=0){
                    b = false ;
                    break;
                }
            }
            if(b){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s));
    }
}
