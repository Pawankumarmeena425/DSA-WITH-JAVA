package com.company;

import java.util.ArrayList;

public class Ch_16_Generics {
    public static void main(String[] args) {
        ArrayList ar  = new ArrayList();
//        Withoout given Arraylist which type of parameter we stored in this
        ar.add("Pawan");
        ar.add(34);
        ar.add(64);
        ar.add(5.34);
        ar.add("Rohan");

    String a  =(String)ar.get(0);
//    If we sotre multiple type of variable in arraylist , then we must be typecast during the access

        System.out.println((int) ar.get(1));
//        System.out.println((float) ar.get(3));
//        WE can't typecast Double in the java language
        System.out.println(a);
    }
}
