package com.company;

public class HalfButterflyWithCharacter {
    public static void main(String[] args) {
        int n = 10;

        for (int i = n; i >=1; i--) {
            char c = 'A';
            for (int j = 1; j<=i; j++) {
                System.out.print(c + " ");
                c++;
            }
            c--;

            for (int k=1;k<=2*(n-i)-1;k++){
                if (i==n){

                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <=i; j++) {
                if (j==n){

                }
                else {
                    System.out.print(c + " ");
          c--;
                }

            }
            System.out.println();
        }
    }
}