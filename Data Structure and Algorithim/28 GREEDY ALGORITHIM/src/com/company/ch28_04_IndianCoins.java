package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ch28_04_IndianCoins {
    public static void main(String[] args) {
        int stand[]={1,2,5,10,20,50,100,500,2000};
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of ruppes!!");
        int rup = sc.nextInt();
        int si=0,ei=stand.length-1;
        int count=0;
        Arrays.sort(stand);
        for(int i=stand.length-1;i>=0;i--){
             if(stand[i]<=rup){
                 while(stand[i]<=rup){
                     rup   = rup-stand[i];
                     count++;
                 }
             }


        }
        System.out.println(count);
    }
}
