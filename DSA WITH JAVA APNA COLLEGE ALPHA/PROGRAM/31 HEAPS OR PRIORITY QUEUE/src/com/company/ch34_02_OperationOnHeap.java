package com.company;

import java.util.ArrayList;

public class ch34_02_OperationOnHeap {

static class Heapc{
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size()==0;
    }
    public static void add(int data){
        list.add(data);
        int x =  list.size()-1;//child node index(current)
        int p = (x-1)/2;
        while(list.get(x)<list.get(p))
        {
            int temp = list.get(x);
            list.set(x,list.get(p));
            list.set(p,temp);
            x = p;
            p  = (x-1)/2;
        }
    }
    public static int peek(){
        return list.get(0);
    }
    private static void hipify(int i){
        int minInd = i;
        int left = 2*i+1;
        int right   =2*i+2;
        if(left<list.size()&&list.get(left)<list.get(minInd)){
            minInd = left;

        }
        if(right<list.size()&&list.get(right)<list.get(minInd)){
            minInd = right;
        }

        if(minInd!=i){// means change happen in the minimun index that is passed
            // Sweaping
            int temp = list.get(i);
            list.set(i,list.get(minInd));
            list.set(minInd,temp);
            hipify(minInd);
        }
    }
    public static int remove(){
        // Sweap firs and last ememnt of the lit
        int temp = list.get(0);
        list.set(0,list.get(list.size()-1));
        list.set(list.size()-1,temp);

        // Now root node become the last nood and delete that node
        int val = list.remove(list.size()-1);

        // Call hipify
        hipify(0);

        return    val;

    }

}

    public static void main(String[] args) {
Heapc hp  = new Heapc();
hp.add(2);
hp.add(4);
hp.add(5);
hp.add(3);
hp.add(10);
        System.out.println(Heapc.list);
        while(!hp.isEmpty()){
            System.out.println(hp.peek());
           hp.remove();
        }
    }
}
