package com.company;

public class ch_14_08_nth_sqrt {
    public static long multiply(int val  ,int pow){
        long ans =1;
        int i = 0;
        while(i<pow){
            ans *= val;
            i++;
        }
        return ans;
    }
    public static int nthSqrt(int n , int num){
        int low = 1 ,high = num;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(multiply(mid , n)==num){
                return mid;
            }
            else if(multiply(mid,n)<num){
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
        int n = 5;
        int num  =99;
        System.out.println(nthSqrt(n,num));
    }
}
