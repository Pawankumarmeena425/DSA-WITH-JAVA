package com.company;

import java.util.HashMap;
public class ch35_03_ValidAnagram {
    public static boolean ValidAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Integer>hm1 = new HashMap<>();
        HashMap<Character,Integer>hm2 = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);// count frequency of charachet
        }
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);// count frequency of charachet
        }
        for (Character key:hm1.keySet()
             ) {
            if(hm2.containsKey(key)&&hm1.get(key)==hm2.get(key)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(ValidAnagram("lulip","lipid"));
    }
}
