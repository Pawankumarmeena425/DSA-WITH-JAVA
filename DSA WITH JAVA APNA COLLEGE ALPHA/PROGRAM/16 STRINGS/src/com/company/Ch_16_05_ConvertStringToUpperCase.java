package com.company;

public class Ch_16_05_ConvertStringToUpperCase {
    public static String toupperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i=1;i<str.length();i++){
          if (str.charAt(i-1)==' '||str.charAt(i-1)==','){
              sb.append(Character.toUpperCase(str.charAt(i)));
            }
          else{
              sb.append(str.charAt(i));
          }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        String sb = "hi,i am shradha!";

        System.out.println(toupperCase(sb));
    }
}
