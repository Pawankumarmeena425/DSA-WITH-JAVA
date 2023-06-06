package com.company;

public class ch22_03_SubsetInArray {
    public static void subSet(char arr[],char ans[],int i){
        if(i==arr.length){
            printArr(ans);
            return ;
        }

//        choice yes
        ans[i]=arr[i];
        subSet(arr,ans,i+1);
//        choice no
        ans[i]=0;
        subSet(arr,ans,i+1);
    }
    public static void printArr(char arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                break;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char arr[]={'a','b','c'};
        char ans[]=new char[arr.length];
        subSet(arr,ans,0);
    }
}
