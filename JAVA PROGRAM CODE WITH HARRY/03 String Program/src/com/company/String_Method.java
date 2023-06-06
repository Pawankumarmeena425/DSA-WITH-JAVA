package com.company;

import java.util.Locale;

public class String_Method {
    public static void main(String[] args) {
        String name = "Pawan";
        System.out.println(name);
        int length =  name.length();
        System.out.printf("Length of the String is %d.\n",length);
        String lowecase = name.toLowerCase(Locale.ROOT);
        System.out.printf("String after convert into lowercase  =  %s\n",lowecase);
        String upercase = name.toUpperCase(Locale.ROOT);
        System.out.printf("String after convert into lowercase  =  %s\n",upercase);

        String nontermed =  "     Pawan Kumar meena     ";
//        We can also print the string in the following way
        System.out.println(nontermed);
        String termed  =  nontermed.trim();
        System.out.printf("String After the trim = %s.\n\n",termed);
        System.out.println("**Let's Discuss about the string substing method**");
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));/*It will include the start index but exclude the end index*/
        System.out.println(name.substring(0));

        System.out.println(name.replace('a','y'));
        System.out.println(name.replace("awa","way"));
        System.out.println(name.replace("a","way"));
        System.out.println(name.startsWith("p"));

        System.out.println("Lets Discuss about index of::");
        System.out.println(name.indexOf("wa"));/*It return first index of the matching character*/
        System.out.println(name.indexOf("wa",3));
        System.out.println(name.lastIndexOf("aw"));
    }
}
