package com.company;

import java.util.PriorityQueue;

public class ch_23_04_WeakestSolder {
   static class Carpooling implements Comparable <Carpooling> {
        int numpass;
        int from;
        int to;

        Carpooling(int numpass, int from, int to) {
            this.numpass = numpass;
            this.from = from;
            this.to = to;
        }

        public int compareTo(Carpooling obj) {
            return this.from - obj.from;
        }
    }
    public static boolean carPooling(int[][] trips, int capacity) {
        PriorityQueue<Carpooling>pq = new PriorityQueue<>();
        for(int i=0;i<trips.length;i++){

            pq.add(new Carpooling(trips[i][0],trips[i][1],trips[i][2]));
        }
        int prenum = pq.peek().numpass;
        int prefrom = pq.peek().from;
        int preto     = pq.peek().to;
        capacity = capacity-prenum;
        while(!pq.isEmpty())
        {
            int currnum = pq.peek().numpass;
            int currfrom = pq.peek().from;
            int currto = pq.peek().to;
            if(currfrom>=preto){
                capacity = capacity+prenum;
            }
            if(capacity>=currnum){
                capacity = capacity-currnum;
            }
            else if(capacity<currnum){
                return false;
            }
            prenum = currnum;
            prefrom = currfrom;
            preto = currto;
            pq.remove();
        }

        return true;
    }
    public static void main(String[] args) {
       int trips[][]={{2,1,5},{3,3,7}};
        System.out.println(carPooling(trips,5));

    }
}
