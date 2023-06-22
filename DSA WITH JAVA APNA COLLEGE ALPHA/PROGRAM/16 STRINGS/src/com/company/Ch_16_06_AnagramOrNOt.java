package com.company;

public class Ch_16_06_AnagramOrNOt {
    public static boolean anagram(String str1,String str2){
        int count=0;
        for (int i=0;i<str1.length();i++){
            char ch =str1.charAt(i);
            count =0;
            for (int j=0;j<str2.length();j++){
                if (ch==str2.charAt(j)){
                    count++;
                    break;
                }

            }
           if (count==0){
               return false;
           }
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "racpe";
        String str2 = "care";
        System.out.println( anagram(str1,str2));

    }
}
