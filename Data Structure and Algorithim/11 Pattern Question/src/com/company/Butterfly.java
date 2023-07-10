package com.company;

public class Butterfly {
    public static void main(String[] args) {
        int n=7;
//        First half Pattern
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int k=1;k<=(2*n-2*i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        Other Half Pattern
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int k=1;k<=(2*n-2*i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
