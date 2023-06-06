package com.company;

import java.util.Date;

public class Ch_15_11_PracticeSet02 {
    public static void main(String[] args) {
// Use the Date Class in java to print time in the following formeat:::
//        21:45:02
        Date d = new Date();
        System.out.println(d.getHours() +":"+d.getMinutes()+":"+d.getSeconds());
    }
}
