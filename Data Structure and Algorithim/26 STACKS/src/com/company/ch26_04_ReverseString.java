package com.company;
import java.util.Stack;
public class ch26_04_ReverseString {

    public static String reverseString(String str){
        Stack <Character> s = new Stack<>();
    //    push all character of string into the stack
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        StringBuilder sb  =new StringBuilder("");
    //   append all character into sb
    // charcter will be pop in reverse order
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Hellow World";
        System.out.println(reverseString(str));
    }
    
}
