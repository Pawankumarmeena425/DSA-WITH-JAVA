package com.company;

import java.util.Arrays;
import java.util.Collections;

public class ch28_06_chocolaProblem {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer horCost[]={4,1,2};
        Integer verCost[]={2,1,3,1,4};

//        Sort in decanding order
        Arrays.sort(horCost,Collections.reverseOrder());
        Arrays.sort(verCost,Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;
        while(h<horCost.length&&v<verCost.length){
            if(horCost[h]<=verCost[v]){//vertical cuts , because expensive cuts first
                cost+=verCost[v]*hp;
                vp++;
                v++;
            }
            else{
                cost+=horCost[h]*vp;
                hp++;
                hp++;
            }
        }
//        Remaining part
        while(h<horCost.length){
            cost+=horCost[h]*vp;
            hp++;
            hp++;
        }
        while(v<verCost.length){
            cost+=verCost[v]*hp;
            vp++;
            v++;
        }

        System.out.println("Minimal cost is = "+cost);
    }
}
