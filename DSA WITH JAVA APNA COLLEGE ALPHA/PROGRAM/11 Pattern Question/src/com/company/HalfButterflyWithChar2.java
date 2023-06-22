package com.company;

public class HalfButterflyWithChar2 {
    public static void main(String[] args) {
        int n=7;
        char c =  'A';
        for (int i=0;i<=n;i++){
            for (int j=0;j<2*n-1;j++){
                if (j<n-i||j>=n+i){
                    System.out.print(c+" ");
                    if (j<=n-i){
                        c++;
                    }
                    else{
                        c--;
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            c++;
        }
    }
}
