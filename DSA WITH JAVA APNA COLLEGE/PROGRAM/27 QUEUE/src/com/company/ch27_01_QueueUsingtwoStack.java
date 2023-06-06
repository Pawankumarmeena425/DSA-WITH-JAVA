package com.company;

import java.util.Stack;

public class ch27_01_QueueUsingtwoStack {
    static class QueueStack{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer>s2 = new Stack<>();
        public boolean isEmpty(){
            return s1.isEmpty();
        }
        public  void add(int data){
            if(s1.isEmpty()){
                s1.push(data);
                return;
            }
//            Transfer s1 data to s2
            while(!s1.isEmpty()){
                s2.push(s1.peek());
                s1.pop();
            }
//            NOw add data to the s1
            s1.push(data);
//            Again transfer data s2 to s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
           return s1.pop();
        }
        public int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }


    }
    public static void main(String[] args) {
QueueStack qs   = new QueueStack();
qs.add(1);;
qs.add(2);;
qs.add(3);
qs.add(4);
while(!qs.isEmpty()){
    System.out.println(qs.peek());
    qs.remove();
}
        System.out.println(qs.peek());
    }
}
