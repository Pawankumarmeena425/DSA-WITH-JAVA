package com.company;

import java.util.PriorityQueue;

public class ch34_05_MaximumSlidingWindow {
public static class Sliding implements Comparable<Sliding>{
    int val,ind;
    Sliding(int val,int ind){
        this.val = val;
        this.ind = ind;
    }
    @Override
    public int compareTo(Sliding obj){
        // Asecandin Order
//        return this.val-obj.val;
        // Decending order
        return obj.val-this.val;
    }
}
    public static void main(String[] args) {
        int arr[] =  {1,3,-1,-3,5,3,6,7};int k=3;
        PriorityQueue<Sliding> pq = new PriorityQueue<>();
        int ans[]  =new int[arr.length-k+1];
        // 1st window
        for(int i=0;i<k;i++){
        pq.add(new Sliding(arr[i],i));
        }
        ans[0]  = pq.peek().val;

        for(int i=k;i<arr.length;i++){
            while(pq.size()>0&&pq.peek().ind<=(i-k)){
                pq.remove();// yedi top ka value ka index window se bhar jata hia to ushe remove karna HAI

            }
            pq.add(new Sliding(arr[i],i));
            ans[i-k+1]  = pq.peek().val;


        }


        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
