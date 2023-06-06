package com.company;

public class BasicArray {
    public static void main(String[] args) {
        int []marks = new int[5];
        marks[0]=342;
        marks[1]=324;
        marks[2]=234;
        marks[3]=34;
        marks[4]=324;
        System.out.println(marks[3]);
//        We can reallocate the arrays value
        marks[3]=356424;
        System.out.println(marks[3]);
//        If we gone beyone the size of the array in that case java language wil give error
        marks[5]=324;

    }
}
