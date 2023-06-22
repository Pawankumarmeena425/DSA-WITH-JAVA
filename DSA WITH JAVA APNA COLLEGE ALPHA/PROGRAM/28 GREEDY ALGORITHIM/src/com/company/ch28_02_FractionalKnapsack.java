package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class ch28_02_FractionalKnapsack {
    public static void main(String[] args) {
        int value[]={60,100,180};
        int weight[]={10,20,30};
        int capicity = 50;
        int ratio[]=new int[value.length];
        for(int i=0;i<value.length;i++){
            ratio[i] = value[i]/weight[i];
        }

        int newRatio[][]=new int[ratio.length][2];
        for(int i=0;i<ratio.length;i++){
            newRatio[i][0]=i;
            newRatio[i][1]=ratio[i];
        }

//        Sort array on the basic of the column 2
        Arrays.sort(newRatio, Comparator.comparingDouble(o->o[1]));
        int totalvalue=0;
//        Arrays sorting will be in the decending order
        for(int i=ratio.length-1;i>=0;i--){
            int index = newRatio[i][0];
            if(capicity>=weight[index]){
               //Include complete item
               capicity = capicity-weight[index];
               totalvalue = totalvalue+value[index];

            }
            else{
                // inc2 = {int[2]@815} [0, 6]lude only fractional part will can be fill in the box
                totalvalue = totalvalue+ratio[index]*capicity;
                break;
            }
        }
        System.out.println("Maximum value  ::"+totalvalue);
    }
}
