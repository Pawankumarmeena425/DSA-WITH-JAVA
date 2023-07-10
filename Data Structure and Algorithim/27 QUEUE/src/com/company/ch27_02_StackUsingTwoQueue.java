package com.company;
import java.util.*;

public class ch27_02_StackUsingTwoQueue {
    static class StackQueue{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer>q2 = new LinkedList<>();
        public boolean isEmpty(){
            return q1.isEmpty();
        }

//        Add operations
        public void add(int data){
            if(q1.isEmpty()){
                q1.add(data);
                return ;
            }
//            transfer q1 data to q2
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
        public int remove(){
            return q1.remove();
        }
        public int peek(){
            return q1.peek();
        }



    }
    public static void main(String[] args) {
//        push ---O(n)
        StackQueue sq = new StackQueue();
        sq.add(1);;
        sq.add(2);
        sq.add(3);
        sq.add(4);
        while(!sq.isEmpty()){
            System.out.println(sq.remove());
        }
    }
}
