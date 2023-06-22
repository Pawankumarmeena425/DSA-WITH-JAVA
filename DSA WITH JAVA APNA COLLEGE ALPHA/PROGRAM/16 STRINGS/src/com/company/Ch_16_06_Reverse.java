package com.company;

public class Ch_16_06_Reverse {
    public static void reverse(String str)
    {
  char[]strarry = str.toCharArray();
        System.out.println(strarry.length);

        int end = str.length()-1;
        for (int i=0;i<strarry.length/2;i++){
            char temp = strarry[i];
            strarry[i]=strarry[end-i];
            strarry[end-i]=temp;
        }
        System.out.println(strarry);

    }
    public static void main(String[] args) {
        String str = "racpe";

        reverse(str) ;
    }
}
