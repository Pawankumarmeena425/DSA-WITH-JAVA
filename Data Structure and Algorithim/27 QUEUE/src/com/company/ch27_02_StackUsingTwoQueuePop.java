package com.company;
import java.util.*;
public class ch27_02_StackUsingTwoQueuePop {
    static class StackQueue{
    Queue <Integer> q1 = new LinkedList<>();
    Queue<Integer>q2 = new LinkedList<>();
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    public void add(int data){
        q1.add(data);
    }
    public int remove(){
        if(q1.isEmpty()){
            return -1;
        }
//        transfer all data q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
int val = -1;
//        again transfer all data q2 to q1 but last value of q2 is store in the val
        while(!q2.isEmpty()){
           val = q2.remove();
//           Last element case
           if(q2.isEmpty()){
               break;
           }
          q1.add(val);
        }
//Now all data q2 transfer to q1 except last value
        return val;
    }


        public int peek(){
            if(q1.isEmpty()){
                return -1;
            }
//        transfer all data q1 to q2
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
        int val=-1;
            while(!q2.isEmpty()){
                val = q2.peek();
                q1.add(q2.remove());
            }
            return val;
        }

    }
    public static void main(String[] args) {
        StackQueue sq = new StackQueue();
        sq.add(1);;
        sq.add(2);
        sq.add(3);
        sq.add(4);
        while(!sq.isEmpty()){
            System.out.println(sq.peek());
            sq.remove();
        }

    }
}
