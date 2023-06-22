package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class ch28_03_MaxChainOfPair {
    public static void main(String[] args) {
        int pair[][]={{5,24},{39,60},{25,28},{29,40},{50,90}};
        Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));
        int maxLen=0;
        int firstend = pair[0][1];
        maxLen = 1;
        for(int i=1;i<pair.length;i++){
            int secondStart =  pair[i][0];
            if(firstend<secondStart){
                maxLen++;
                firstend = pair[i][1];
            }
        }
        System.out.println("Maximum chain that can be formed "+maxLen);
    }
}

