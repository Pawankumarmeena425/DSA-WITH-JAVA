package com.company;

public class Ch_15_04_WavePrint {
    public static int[] wavePrint(int arr[][], int nRows, int mCols) {
        // Write your code here.
        int i=0,val=0;
        int index=0;
        int wavearr[]=new int[nRows*mCols];
        for(int j=0;j<arr[0].length;j++){
            int count=0;
            if (j==0||j%2==0){
                i=0;
            }
            else{
                i = arr.length-1;
            }
            while(count<arr.length){
                wavearr[index]=arr[i][j];
                index++;
                if (j==0||j%2==0){
                    i++;
                }
                else{
                    i--;
                }
                count++;
            }
            if(val==0){
                val=1;
                i--;
            }
            else{
                val=0;
                i++;
            }

        }
        return wavearr;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,4,4},{6,7,8,9},{9,8,7,6},{3,4,5,6}};
        wavePrint(arr,arr.length,arr[0].length);
    }
}
