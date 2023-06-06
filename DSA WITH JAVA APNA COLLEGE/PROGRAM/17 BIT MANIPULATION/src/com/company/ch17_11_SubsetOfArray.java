package com.company;

public class ch17_11_SubsetOfArray
{
    public static void subsetArray(int arr[]){
//       total number of subset   = n
        int n  = 1<<(arr.length);
//        BitMask lies 0 to n-1
        System.out.print(" ");
       for(int i=0;i<n;i++){
           int num = i ;
           int j=0;
           while(num!=0){
               if((num&1)!=0){
                   System.out.print(arr[j]+" ");
               }
               j++;
               num = num>>1;
           }
           System.out.print(", ");
       }
    }

    public static void main(String[] args) {
        int arr[]={2,3,4};
        subsetArray(arr);
    }
}
