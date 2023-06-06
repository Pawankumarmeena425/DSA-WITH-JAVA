package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ch_15_09_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
//        DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String myDate  = dt.format(dtf);
        System.out.println(myDate);
//        Other alternetive way to Print Desired formet of date with the help of Java Docs
        DateTimeFormatter dtf2 =  DateTimeFormatter.ISO_DATE_TIME;
        String myDate2  = dt.format(dtf2);
        System.out.println(myDate2);
    }
}
