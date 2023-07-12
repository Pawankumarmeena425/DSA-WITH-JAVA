package com.company;
import java.util.*;
public class ch27_04_QueueReversal {
    public static void queueReversal(Queue<Integer>q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void queueReversalRecursion(Queue<Integer>q){
        if(q.isEmpty()){
            return;
        }
        int val = q.remove();
        queueReversalRecursion(q);
        q.add(val);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        queueReversal(q); // time complexity : O(n)  && space complexity : O(n)
        System.out.println("Queue after reverse");
        System.out.println(q);

        queueReversalRecursion(q);
        System.out.println("Queue Reversal Using Recursion : " );
        System.out.println(q);
//       Time Complexity = O(n)
    }
}
