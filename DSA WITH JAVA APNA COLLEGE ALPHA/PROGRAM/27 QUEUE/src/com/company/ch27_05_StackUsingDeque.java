package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ch27_05_StackUsingDeque {
    static class StackDeque{
        Deque<Integer>dq =new LinkedList<>();
        public boolean isEmpty(){
            return dq.isEmpty();
        }
//        push operation
        public void push(int data){
            dq.addLast(data);
        }
//        Pop operation
        public int  pop(){
            return dq.removeLast();
        }
        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        StackDeque sd = new StackDeque();
        sd.push(1);
        sd.push(2);
        sd.push(3);
        sd.push(4);
        while(!sd.isEmpty()){
            System.out.println(sd.peek());
            sd.pop();
        }
    }
}
