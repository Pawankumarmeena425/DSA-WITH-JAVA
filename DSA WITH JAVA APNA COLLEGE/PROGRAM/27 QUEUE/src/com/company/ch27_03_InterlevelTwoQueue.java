package com.company;
import java.util.*;
public class ch27_03_InterlevelTwoQueue {
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


      while(!q.isEmpty()){
          System.out.println(q.remove());
      }


    }
}
