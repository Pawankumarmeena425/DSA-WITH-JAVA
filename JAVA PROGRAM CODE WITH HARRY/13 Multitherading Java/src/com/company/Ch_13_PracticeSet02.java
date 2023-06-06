package com.company;
class PracticeSet1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!!! Bacho ");
            try {
                Thread.sleep(2000); // sleep/stop a thread for 1 second
            } catch(InterruptedException e){
            System.out.println("An Excetion occured: " + e);}
        }
    }
}
class PracticeSet2 extends Thread {
    public void run(){
        while(true){
            System.out.println("Welcome !!! Bacho ");
            try {
                Thread.sleep(2000); // sleep/stop a thread for 1 second
            } catch(InterruptedException e){
                System.out.println("An Excetion occured: " + e);}
        }
    }
}
public class Ch_13_PracticeSet02 {
    public static void main(String[] args) {
PracticeSet1 t1 = new PracticeSet1();
PracticeSet2 t2  = new PracticeSet2();
t1.start();
t2.start();
    }
}
