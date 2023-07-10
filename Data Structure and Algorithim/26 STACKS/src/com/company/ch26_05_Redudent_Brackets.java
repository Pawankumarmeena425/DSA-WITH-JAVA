package com.company;
import java.util.*;
public class ch26_05_Redudent_Brackets {
    public static boolean findRedundantBrackets(String str)
    {
        Stack<Character> s = new Stack<>();
        // Write your code here.
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=')'){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return true;
                }
                boolean isRedudent = true;
                while(!s.isEmpty() && s.peek()!='('){
                    if(s.peek()=='+'||s.peek()=='-'||s.peek()=='*'||s.peek()=='/'){
                        isRedudent = false;

                    }
                    s.pop();
                }
                if(isRedudent){
                    return true;
                }
                s.pop();// for removing '('
            }
        }

        return false;
    }
    public static void main(String[] args) {
// two bracket are redudent , if in between there is no operator
        String str  = "(a*b+(c/d))";
        System.out.println(findRedundantBrackets(str));
    }
}
