package com.company;

public class ch19_10_RemoveDuplicate {
    public static String reomveDuplicate(String str,int arr[],int i,StringBuilder sb){

        if (i==str.length()){
            return sb.toString();
        }
       int arrindex = str.charAt(i)-'a';
        arr[arrindex]++;
        if (arr[arrindex]==1){
            sb.append(str.charAt(i));
        }
        reomveDuplicate(str,arr,i+1,sb);
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "appnnacollegek";
        int arr[]=new int[26];
        StringBuilder sb = new StringBuilder("");
        System.out.println(reomveDuplicate(s,arr,0,sb));
    }
}
