package com.company;
import java.util.Random;
public class RandomNumberGenerator {
    public static void main(String[] args) {
	// write your code here
        Random d  =new Random();
        for (int i=1;i<=5;i++) {
            System.out.println(d.nextInt(10));
//            It will Generate random number between 1 to 9
        }
    }
}
