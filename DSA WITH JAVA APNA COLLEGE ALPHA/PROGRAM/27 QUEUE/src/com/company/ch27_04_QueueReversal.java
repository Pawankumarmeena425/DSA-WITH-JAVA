package com.company;
import java.util.*;
public class ch27_04_QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println("Queue after reverse");
//        while(!q.isEmpty()){
//            System.out.println(q.remove());
//        }
        System.out.println(q);
    }
}
