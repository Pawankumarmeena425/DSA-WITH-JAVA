package com.company;

import java.util.Arrays;

public class ch_15_09_Aggressive_cows {
    public static boolean isPossible(int stall[] , int cows , int maxDis){
//        first cows always sit on first position
        cows--;
        int prev = stall[0];
        for(int i=1;i<stall.length;i++){
            if(stall[i]-prev>=maxDis){
                prev = stall[i];
                cows--;//sit another cow
            }
            if(cows==0){
                return true;
            }
        }
        return cows<=0;
    }
    public static int aggressiveCows(int stall[],int cows){
        Arrays.sort(stall);
        int n = stall.length;
        int ans = 0;
        int low = 0;
        int high = stall[n-1];
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(stall , cows,mid)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int stall[] = {1,2,8,4,9};
        int cows = 3;
        System.out.println(aggressiveCows(stall,cows));
    }
}
