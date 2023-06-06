package com.company;

public class Literals {
    public static void main(String[] args) {
        byte age=34;
        short  age2=3423;
        int age3=3252252;
        long age4=34525252545435325l;
//         By default long as a considered as a integer letral , so if we don't use l after the long literal no problem
//         but when we store value out of the integer range in that case it give error so after the long literal we must
//        use 'l' after the constant value
        char ch='A';
        float f= 3.2f;
//        By default float is considered as a double
//        So for floating point letral we must use f after the constant
        double d=34.23;

        System.out.println(age);
        String str="pawan";
//        First latter of the string must be capital otherwise it will give error
//In the java language String is a special spport
        System.out.println(str);

    }
}
