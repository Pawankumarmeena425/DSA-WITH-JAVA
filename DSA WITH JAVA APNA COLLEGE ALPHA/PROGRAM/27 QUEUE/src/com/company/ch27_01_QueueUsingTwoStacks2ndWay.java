package com.company;

import java.util.Stack;

public class ch27_01_QueueUsingTwoStacks2ndWay {
    static class QueueStack{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
public boolean isEmpty(){
    return s1.isEmpty();
}
        public void add(int data){
            s1.push(data);
        }
        public int remove(){
            if(s1.isEmpty()){
                return -1;
            }
//            Transfer all data of stack 1to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int val = s2.pop();
//            Transfer all data of s2 to s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return val;
        }
        public int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty!!");
                return -1;
            }
            //            Transfer all data of stack 1to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int val = s2.peek();
//            Transfer all data of s2 to s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return val;
        }
    }
    public static void main(String[] args) {
QueueStack qs = new QueueStack();
qs.add(1);
qs.add(2);
qs.add(3);
while(!qs.isEmpty()){
    System.out.println(qs.peek());
    qs.remove();

}
    }
}
