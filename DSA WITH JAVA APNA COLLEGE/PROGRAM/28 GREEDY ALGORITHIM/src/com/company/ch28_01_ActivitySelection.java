package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ch28_01_ActivitySelection {
    public static void activitySelection(int start[],int end[]){
        ArrayList<Integer>ans = new ArrayList<>();
        int maxAct=0;
//        Storing start and end in the 2d array
        int activity[][]=new int[start.length][3];

        for(int i=0;i<start.length;i++){
            activity[i][0] = i; // Storing index
            activity[i][1]=start[i]; //storing starting time of ith activiyt
            activity[i][2]=end[i];  //storing ending time of  ith activity
        }
//        Sort 2d array on the basic of the colmun 2--->> end time bases
        Arrays.sort(activity, Comparator.comparingDouble(o->o[2]));

        ans.add(activity[0][0]);
        maxAct++;
        int lastend = activity[0][2];
        for(int i=1;i<start.length;i++){
            if(activity[i][1]>=lastend){
                maxAct++;
                lastend = activity[i][2];
                ans.add(activity[i][0]);
            }
        }

        System.out.println("Maximum no of activity is :: "+maxAct);

        System.out.println("Activity INclude::");
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }

    }
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        ArrayList<Integer>ans = new ArrayList<>();//for storing answer(activity)
//        end time bases sorting
        int maxAct =0;
        ans.add(0);
        maxAct++;
        int lastend = end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                maxAct++;
                lastend = end[i];
                ans.add(i);
            }
        }
        System.out.println("\nMaximum no of activity is :: "+maxAct);

        System.out.println("Activity INclude::");
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

//        If sort on the bases of start
        int start1[]={0,1,3,5,5,8};
        int end1[]={6,2,4,7,9,9};

        activitySelection(start1,end1);


    }
}
