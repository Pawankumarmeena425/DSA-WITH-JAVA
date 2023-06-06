package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class ch27_06_QueueUsingDeque {
    static class QueueDeque{
        Deque<Integer>dq  = new LinkedList<>();
        public boolean isEmpty(){
            return dq.isEmpty();
        }
        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }

    }
    public static void main(String[] args) {
        QueueDeque qd = new QueueDeque();
        qd.add(1);
        qd.add(2);
        qd.add(3);
        qd.add(4);
        qd.add(5);
        qd.add(6);
        while(!qd.isEmpty()){
            System.out.println(qd.peek());
            qd.remove();
        }
    }
}
