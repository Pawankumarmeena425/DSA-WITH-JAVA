
package com.company;
import java.util.Arrays;
public class ch20_00_PracticeQuestion {
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum =0;
        int n = 1<<arr.length;
        for(int i=1;i<n;i++){
            int val = i;
            int count =0;
            while(val!=0){
                if((val&1)!=0){
                    count++;
                }
                val = val>>1;
            }
            int num =i;
            // Even length subarray
            int j=0;
            if(count%2!=0){
                while(num!=0){
                    if((num&1)!=0){
                        sum = sum+arr[j];

                    }
                    j++;
                    num = num>>1;
                }
            }

        }

        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3};
//        System.out.println(sumOddLengthSubarrays(arr));

        for (int i=0;i<32;i++){
            String binary = Integer.toBinaryString(i);
            System.out.println(i+" = "+binary);
        }
    }
}

