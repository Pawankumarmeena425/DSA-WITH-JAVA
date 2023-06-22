package com.company;

public class ch19_12_SayDigit {
    public static void sayDigit(String arr[],int n){
        if (n==0){
            return;
        }
        int digit = n%10;
        sayDigit(arr,n/10);
        System.out.print(arr[digit-1]+"  ");
    }
    public static void main(String[] args) {
        String arr[] = {"one","two","three","four","five","six","eight","nine","ten"};
        sayDigit(arr,314124);
    }
}
