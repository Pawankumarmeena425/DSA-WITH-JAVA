package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ch23_04_NearbyCars {
    public static void nearByCars(int arr[][],int k){
        ArrayList<Integer>list  = new ArrayList<>();
        PriorityQueue<Double> pq  =new PriorityQueue<>();
        // Distance bw two poing(x,y)  = root(x2+y2)
        for(int i=0;i<arr.length;i++){
          double dis = Math.sqrt(Math.pow(arr[i][0],2)+Math.pow(arr[i][1],2));
          pq.add(dis);
        }
        int count=0;
        while (count<k){
            System.out.println(pq.remove());
            count++;
        }
    }


    public static class NearbyCars implements Comparable<NearbyCars>{
        int dis;
        int ind;
        NearbyCars(int dis,int i){
            this.dis = dis;
            this.ind = i;
        }
        @Override
        public int compareTo(NearbyCars obj2){
            return this.dis-obj2.dis; // Sorting will be in the escending order
        }
    }
    public static void main(String[] args) {
        int car[][]={{3,3},{5,-1},{-2,4}};
nearByCars(car,2);// this will print nearest k cars distance not cars if we want to print cars then implement using class
PriorityQueue<NearbyCars> pq = new PriorityQueue<>();// Class object
        for(int i=0;i<car.length;i++){
            int dis = car[i][0]*car[i][0]+car[i][1]*car[i][1];
            pq.add(new NearbyCars(dis,i));// yha par shortes distance wala object return hota hai
            // isliye through object we can access all the properties of class
        }
        int count=0;
        while(count<2){
            System.out.println("C"+pq.remove().ind);
            count++;
        }
    }
}
