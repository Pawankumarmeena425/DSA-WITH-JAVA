package com.company;

public class ch19_09_TillingProblem {
    public static int tillingProblem(int n){
        if (n==1||n==0){
            return 1;
        }
//        Vertical Choice
        int fnm1 = tillingProblem(n-1);

//        For Horizontal Choice
        int fnm2 = tillingProblem(n-2);
        return fnm1+fnm2;

    }

    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    }
}
