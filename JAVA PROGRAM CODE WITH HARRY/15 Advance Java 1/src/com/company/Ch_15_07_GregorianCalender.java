package com.company;

import java.util.GregorianCalendar;

public class Ch_15_07_GregorianCalender {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
//        Gregorian Calender is a concrite class , so we can create object of this.
        System.out.println(g.isLeapYear(2004));
        System.out.println(g.getCalendarType());
    }
}
