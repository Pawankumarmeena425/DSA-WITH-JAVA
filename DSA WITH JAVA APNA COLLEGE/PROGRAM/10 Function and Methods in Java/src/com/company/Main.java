package com.company;

public class Main {

    public static void swap(int a,int b){
        int temp;
        temp = a;
        a = b;
        b  = temp;
        System.out.println("value of a = "+a);
        System.out.println("value of b = "+b);
    }
    public static void main(String[] args) {
	// write your code here
        int a =2;
        int b = 3;
        swap(a,b);
    }
}
