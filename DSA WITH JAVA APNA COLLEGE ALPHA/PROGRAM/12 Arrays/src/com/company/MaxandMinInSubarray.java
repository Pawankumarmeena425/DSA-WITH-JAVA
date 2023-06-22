package com.company;

public class MaxandMinInSubarray {
    public static void MaxandMin(int num[]){
        int ts =0;
        int tsum=0;
        int sum=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<num.length;i++){
            for (int j=i;j<num.length;j++){
                sum=0;
                for (int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
tsum = tsum+num[k];
sum = sum+num[k];
                }
                System.out.print("    ");
                if (sum>max){
                    max = sum;
                }
                if (sum<min){
                    min  = sum;
                }
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total SubArrays = "+ts);
        System.out.println("Total sum of  SubArrays = "+tsum);
        System.out.println("Maximum Sum Of  SubArrays = "+max);
        System.out.println("Minimum Sum Of  SubArrays = "+min);

    }

    public static void main(String[] args) {
        int num[]={7,4,-6,3,6,-2};
        MaxandMin(num);
    }
}
