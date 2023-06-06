package com.company;

import java.util.ArrayList;
import java.util.*;

public class ch23_00_Practice {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<Integer> listp = new ArrayList<>();
        List<List<Integer>>strp=  new ArrayList<>();
        List<String>result = new ArrayList<>();
        // find out the pattern
        int count=1;
        for(int i=0;i<pattern.length()-1;i++){
            if(pattern.charAt(i)==pattern.charAt(i+1)){
                count++;

            }
            else{
                listp.add(count);
                count=1;
            }
        }
        listp.add(count);

// Identifiy pattern of word array

        for(int i=0;i<words.length;i++){
            count=1;
            ArrayList<Integer>list =  new ArrayList<>();
            String curr = words[i];
            for(int j=0;j<curr.length()-1;j++){
                if(j>0) {
                    String str = curr.substring(0, j);
                    if(str.indexOf(curr.charAt(j+1))>=0){
                        break;
                    }
                }
                if(curr.charAt(j)==curr.charAt(j+1)){
                    count++;

                }
                else{
                    list.add(count);
                    count=1;
                }
            }
            list.add(count);
            strp.add(list);
        }

// Check pattern
        for(int i=0;i<strp.size();i++){
            List<Integer> newlist = strp.get(i);

            if(listp.size()!=newlist.size()){
                continue;
            }
            boolean b = true;
            for(int j=0;j<newlist.size();j++){
                if(listp.get(j)!=newlist.get(j)){
                    b= false;
                    break;
                }
            }
            if(b){
                result.add(words[i]);
            }

        }



        return result;
    }

    public static void main(String[] args) {
String words[] = {"abc","cba","xyx","yxx","yyx"};
String patter = "abc";
        System.out.println(findAndReplacePattern(words,patter));

}
}
