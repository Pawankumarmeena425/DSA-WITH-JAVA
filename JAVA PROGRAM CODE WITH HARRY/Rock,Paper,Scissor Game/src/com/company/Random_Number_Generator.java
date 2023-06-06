package com.company;
import java.util.Random;
public class Random_Number_Generator {
    public static void main(String[] args) {

        Random num = new Random();
        int ran = num.nextInt(100);
//        It will generate random number between 1 to 99
        System.out.println(ran);

    }
}
