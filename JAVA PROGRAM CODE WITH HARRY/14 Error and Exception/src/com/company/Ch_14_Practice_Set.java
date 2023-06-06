package com.company;

public class Ch_14_Practice_Set {
    public static void main(String[] args) {

        try{
            int a = 2434/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
            System.out.println(e);
        }
    }
}
