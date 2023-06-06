package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ch23_04_NropeConnect {
    public static int costNRope(int arr[]){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int total = 0 ;
        while(!pq.isEmpty()){
       int d1 = pq.remove();
       if(pq.isEmpty()){ // when only one digit exit in the pq
           break;
       }
                    int d2 = pq.remove();
       int sum   = d1+d2;
       total = total+sum;
       pq.add(sum);
        }
        return total;
    }
    public static void main(String[] args) {
        int rope[]={2,3,3,4,6};
        System.out.println(costNRope(rope));
    }
}
