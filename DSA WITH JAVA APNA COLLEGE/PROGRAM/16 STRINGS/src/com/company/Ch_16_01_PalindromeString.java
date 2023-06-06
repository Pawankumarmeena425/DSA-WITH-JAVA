package com.company;

public class Ch_16_01_PalindromeString {
    public static boolean palindromeString(String str){

        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
String name ="racecar";
boolean val =palindromeString(name);
if (val==true){
    System.out.println("String is a palindrome");

}
else{
    System.out.println(" String is not a palindrome");
}

    }
}
