package com.company;

import java.util.Stack;

public class ch26_05_delete_midddle_in_Stack {
    public static void deleteMiddle(Stack<Integer>s , int count  , int size){
        if(count==size/2){
            s.pop();
            return;
        }
        int top =  s.pop();
        deleteMiddle(s,count+1,size);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(11);
        s.push(8);
        s.push(94);
        s.push(49);
        s.push(67);
        s.push(74);
        s.push(83);
//        Middle element 49 -->> remove it
        int count = 1;
        deleteMiddle(s , count,  s.size());
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
