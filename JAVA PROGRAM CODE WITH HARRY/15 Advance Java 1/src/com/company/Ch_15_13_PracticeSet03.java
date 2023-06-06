package com.company;

import java.util.Calendar;

public class Ch_15_13_PracticeSet03 {
    public static void main(String[] args) {
//        Repeat 2 Question using Calender Class
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
