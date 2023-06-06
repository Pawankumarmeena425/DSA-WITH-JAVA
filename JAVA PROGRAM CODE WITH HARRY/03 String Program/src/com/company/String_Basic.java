package com.company;

public class String_Basic {
    public static void main(String[] args) {
        String name = new String("Pawan");
        System.out.println("The String is " +  name);
//        Alternate Way to declare the String
        String name1  =  "Pawan";
        System.out.print("The Alternate String is :: ");/*This will not print next line*/
        System.out.println(name);

        System.out.println("***Let's Discuss the String Printing Method***");
        int a=3;
        float b= 423.3f;
        System.out.printf("The value of a is %d and the value of B is %f:::\n",a,b);
        /*System.out.printf   And System.out.format Both Work Same */
        System.out.format("The value of a is %d and the value of B is %f:::\n\n",a,b);
//        We can use escape sequence in the java language

        System.out.println("Way to Print the floating Number with desire Space");
        System.out.printf("The value of a is %d and the value of B is %52.2f:::\n",a,b);
//        This will take 52 white space and print the floating point number with 2 number after the decimal value
    }
}
