package com.company;
import java.util.*;
public class ch27_03_InterlevelTwoQueue {
    public static void intervalUsingQueue(Queue<Integer>q){

        Queue<Integer> q2  = new LinkedList<>();
        int n= q.size();
//        Divide queue into two parts
        for( int i=0;i<n/2;i++){
            q2.add(q.remove());
        }
//        NOw fist half in the q2 and second hafl in the q1

        while(!q2.isEmpty()){
            q.add(q2.remove());//first element of the second queue add in original queue
            q.add(q.remove());//second queue(Original ) queue element add in the end of original queue
        }
    }

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
    public static void intervalUsingStack(Queue<Integer>q){
        QueueStack qs = new QueueStack();
        int n = q.size()/2;
        for(int i=0;i<n;i++){ // first half
            qs.add(q.remove());
        }
        while(!qs.isEmpty()){
            q.add(qs.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
//        intervalUsingQueue(q);
//      while(!q.isEmpty()){
//          System.out.println(q.remove());
//      }
//      When ristricted to use queue
        intervalUsingStack(q);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }


    }
}
