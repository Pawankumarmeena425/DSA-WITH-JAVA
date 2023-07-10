package com.company;

public class ch22_04_permutation_In_String {
    public static void permutationString(String str,String ans ){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
//            "abcde"==>> ab+de=abde;
            String newString = str.substring(0,i)+str.substring(i+1,str.length());
            permutationString(newString,ans+str.charAt(i));
        }

    }
    public static void main(String[] args) {
        String str="abc";
        permutationString(str,"");
    }
}
