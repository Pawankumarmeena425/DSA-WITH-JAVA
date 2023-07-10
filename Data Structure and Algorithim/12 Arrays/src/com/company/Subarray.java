package com.company;

public class Subarray {
    public static void subarray(int num[]){
int ts =0;
        for (int i=0;i<num.length;i++){
            for (int j=i;j<num.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");

                }
                System.out.print("    ");
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total SubArrays = "+ts);
    }
    public static void main(String[] args) {
        int num[]={2,3,4,5,6};
        subarray(num);
    }
}
