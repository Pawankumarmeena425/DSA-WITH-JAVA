package com.company;

public class Ch_15_05_Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println("Number Of Hours Since 1970"+ System.currentTimeMillis()/1000/3600);
        System.out.println("Number Of Days Since 1970"+ System.currentTimeMillis()/1000/3600/24);
        System.out.println("Number Of Year Since 1970"+ System.currentTimeMillis()/1000/3600/24/356);


    }
}
