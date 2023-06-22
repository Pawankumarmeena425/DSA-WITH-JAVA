package com.company;

public class ch20_01_CountPrimeNumber {
    public  static int countPrimes(int n) {
        int arr[]=new int[n];
        // Set all element of array to 1
        for(int i=2;i<arr.length;i++){
            arr[i]=1;
        }
        int count=0;
        // Loop for triverse 2 to n-1 Elements
        for(int i=2;i<n;i++){
            if(arr[i]!=0){
                int j=2*i;
// Loop for set ith table element 0
                while(j<n){
                    if(j%i==0){
                        arr[j]=0;
                    }
                    j = j+i;
                }
                count++;
            }


        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countPrimes(40));
    }
}
