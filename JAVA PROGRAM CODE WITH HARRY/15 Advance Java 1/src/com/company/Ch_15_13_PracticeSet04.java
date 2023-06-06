package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ch_15_13_PracticeSet04 {
    public static void main(String[] args) {
        LocalDateTime dt  = LocalDateTime.now();
        DateTimeFormatter df  =DateTimeFormatter.ofPattern("H:m:s");
        String mydate  = dt.format(df);
        System.out.println(mydate);
    }
}
