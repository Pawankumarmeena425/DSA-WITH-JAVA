package com.company;

import java.util.Calendar;

public class Ch_15_07_Celander {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        Calender class is a Abstract class , So we cant's create object of a Calender calss
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) +":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

    }
}
