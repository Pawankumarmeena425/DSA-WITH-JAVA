package com.company;

import java.util.ArrayList;

public class ch23_01_2d_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println("2-d Arraylist Directly:");
        System.out.println(mainList);

//        Print 2d ArrayList using nested loops
        System.out.println("2d Arraylist using nested loops and Triverse each index::");
        for(int i=0;i< mainList.size();i++){
            ArrayList<Integer>currenList = mainList.get(i);
            for (int j=0;j< currenList.size();j++){
                System.out.print(currenList.get(j)+" ");
            }
            System.out.println();
        }

//        Print using nested loop sort
        System.out.println("2d Arraylist Using one loop");
        for(int i=0;i< mainList.size();i++){
            System.out.println(mainList.get(i));
        }



 }
}
