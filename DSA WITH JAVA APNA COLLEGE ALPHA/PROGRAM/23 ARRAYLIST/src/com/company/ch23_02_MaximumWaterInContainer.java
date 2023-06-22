package com.company;

import java.util.ArrayList;

public class ch23_02_MaximumWaterInContainer {
    public static int maxWaterOptimized(ArrayList<Integer>height) {
        int  maxwater=0;
        int lp=0;
        int rp =height.size()-1;
int small;
        while (lp<=rp){
            int width = rp-lp;

            if(height.get(lp)<height.get(rp)){
          small = height.get(lp);
          lp++;
            }
            else{
                small  = height.get(rp);
                rp--;
            }
            int waterlevel  = width*small;
            if(maxwater<waterlevel){
                maxwater = waterlevel;
            }
        }
        return maxwater;
    }
    public static int maxWaterBruteForce(ArrayList<Integer>height){
        int maxwater=0;
        int smallheigth;
        for(int i=0;i<height.size();i++){
            int width=1;
            for(int j=i+1;j<height.size();j++){
                if(height.get(i)<height.get(j)){
                    smallheigth=height.get(i);
                }
                else{
                    smallheigth = height.get(j);
                }
                int waterlevel = smallheigth*width;
                if(maxwater<waterlevel){
                    maxwater = waterlevel;
                }
                width++;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println("Maximum water using Burte Force : "+maxWaterBruteForce(list));
        System.out.println("Maximum water using uptimized apporch : "+maxWaterOptimized(list));
    }
}
