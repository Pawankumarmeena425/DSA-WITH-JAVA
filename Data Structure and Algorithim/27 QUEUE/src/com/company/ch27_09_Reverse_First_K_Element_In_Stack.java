package com.company;
import javax.sound.sampled.Line;
import java.util.*;

public class ch27_09_Reverse_First_K_Element_In_Stack {
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> s = new Stack<>();
        // step 1 : Featch first k element from queue and add into stack
        for(int i=0;i<k;i++){
            s.push(q.remove());
        }

        // Step 2 : Add all elemnt of stack on queue , : these are reverse order
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        // step 3 : now starting N-K element are remain at the start in the queue , which must be at the end of the queue
        for(int i=0;i<q.size()-k;i++){
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        int k=3; //reverse fist k element
        modifyQueue(q,k);
        while (!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
