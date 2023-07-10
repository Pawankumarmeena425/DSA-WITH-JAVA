package com.company;
import java.util.Stack;
public class ch26_05_sort_Stack {
    public static void sortedInsert(Stack<Integer> s , int data){
        if(s.isEmpty() || (!s.isEmpty() && s.peek()<data)){
            s.push(data);
            return;
        }
        int top = s.pop();
        sortedInsert(s,data);
        s.push(top);
    }
    public static void sortStack(Stack<Integer> stack) {
        // Write your code here.
        if(stack.isEmpty()){
            return ;
        }
        int top = stack.pop();
        sortStack(stack);
        sortedInsert(stack , top);
    }
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(4);
        s.push(-5);
        s.push(89);
        s.push(2);
        s.push(0);
        s.push(4);
        s.push(1);
        sortStack(s);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
