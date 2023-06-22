package com.company;

public class PalindromicPatternWithNumbers {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            int val = i;
            for (int k=1;k<=i;k++){
                System.out.print(val+" ");
                val--;
            }
           val = 2;

            for (int k=1;k<i;k++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
}
