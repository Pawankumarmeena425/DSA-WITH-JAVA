package com.company;

public class Operators {
    public static void main(String[] args) {
//        % Operator can be work with the floating point number
        System.out.println(4.8%1.1);

//        Compersion Operator is return true or false
        System.out.println(45==234);
//        Logical Operator return true or false
        System.out.println(34>23 && 45>234);
        System.out.println(34>23 || 45>234);

//        """Bitwise Operator apply on the number convirson
        System.out.println(2&3);
        /*it will return 2
             2   =  10
             3   =   11

          Apply bitwise and
                     10 that's give 2*/
//        concenating two string
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);

//        Equality and retional operator
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");

    }

}

