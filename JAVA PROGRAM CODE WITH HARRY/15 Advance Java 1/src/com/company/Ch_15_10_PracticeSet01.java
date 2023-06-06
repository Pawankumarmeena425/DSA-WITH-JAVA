package com.company;

import java.util.ArrayList;

public class Ch_15_10_PracticeSet01 {
    public static void main(String[] args) {
//        Create a Arraylist and store names of 10 Students inside it .  Print it using for each loop
//        ArrayList <String> l  =new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
//        l.add("Rakesh");
//        l.add("Rohan");
//        l.add("Shubham");
//        l.add("Mohit");
//        l.add("Shoan");
//        l.add("Sumit");
//        l.add("Pawan");
//        l.add("Roit");
//        l.add("Rajesh");
//        l.add("Aswini");
//        l.add("ajay");
//        for (Object elements:
//            l) {
//            System.out.println(elements);
//        }
        int end=arr.size()-1;
        int start = n+1;
        for (int i=1;i<=(arr.size()-start)/2;i++){
            int temp1=arr.get(start);
            int temp2 = arr.get(end);
            arr.set(end,temp1);
            arr.set(start,temp2);
            end--;
            start++;
        }
    }
}
