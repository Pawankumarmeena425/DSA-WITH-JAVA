package com.company;
import java.util.*;

public class ch26_13_InfixToPostfix {

    public static int precdence(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String infixToPostfix(String exp) {

        StringBuilder sb = new StringBuilder();
        Stack<Character>s = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='('){
                s.push(ch);
            }
            else if(ch==')'){
                while(!s.isEmpty() && s.peek()!='('){
                    sb.append(s.pop());
                }
                if(!s.isEmpty()){
                    s.pop();//pop '(
                }

            }
            else if(ch=='+'||ch=='-'||ch=='/'||ch=='*'||ch=='^'){ // when operator is found
                if(s.isEmpty()||s.peek()=='('){
                    s.push(ch);
                }
                else{
                    int chPre = precdence(ch);
                    int topPre = precdence(s.peek());
                    if(chPre>topPre){
                        s.push(ch);
                    }
                    else{
                        while(!s.isEmpty() && precdence(ch)<=precdence(s.peek())){
                            sb.append(s.pop());
                        }
                        s.push(ch);
                    }
                }

            }
            else{
                sb.append(ch);
            }
        }
        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
            String str = "(3-2+l/8)-(4+6/3*(5^8))";
        System.out.println(infixToPostfix(str));
    }
}
