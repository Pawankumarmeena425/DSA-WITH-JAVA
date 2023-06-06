package com.company;

class Practice1 extends Thread {
   public void run(){
        while(true){
            System.out.println("Good Morning!!! Bacho ");
        }
    }
}
class Practice2 extends Thread {
    public void run(){
        while(true){
            System.out.println("Welcome !!! Bacho ");
        }
    }
}
public class Ch_13_PracticeSet01 {
    public static void main(String[] args) {
        Practice2 t2 = new Practice2();
        Practice1 t1  =new Practice1();
        t1.start();
        t2.start();
    }
}
