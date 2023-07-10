package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ch17_10_XOR_Problem_UniqueElements {
    public static void uniqueElements(int arr[]){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res = res^arr[i];
        }
        int num = res;
        int pos=0;
        int j=0;
        while(num!=0){
            if((num&1)!=0){
                pos =j;
                break;
            }
            num = num>>1;
            j++;
        }
        int res1=res,res2=res;
        for(int i=0;i<arr.length;i++){
            if(((arr[i]>>pos)&1)!=0){
                res1  = res1^arr[i];
            }
            else{
                res2 = res2^arr[i];
            }
        }
        System.out.println(res1);
        System.out.println(res2);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,5,3,2,1,745};
        uniqueElements(arr);
      Arrays.sort(arr,0,arr.length);
    }
}
