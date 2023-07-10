package com.company;

public class Ch_15_06_StringComprassion {
    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder("");
        int count =1;
        for (int i=0;i<str.length();i++){
            if(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else if (count>1) {
                sb.append(str.charAt(i));
                    sb.append(count);
                count=1;
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaaaaabbbbbcdddddeeejjjkkk";
        System.out.println(stringCompression(str));
    }
}
