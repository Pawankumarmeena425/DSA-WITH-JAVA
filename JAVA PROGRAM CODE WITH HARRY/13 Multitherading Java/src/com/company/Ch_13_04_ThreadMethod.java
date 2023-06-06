package com.company;
class MyThread4 extends Thread {
    @Override
    public  void run()
    {
        int i=0;
        while(i<21) {
            System.out.println("My Thread1 is Running and I'm Happy !! ");
            i++;
        }
        System.out.println("Thanks for Running Thread 1 !!!");
    }

}
class MyThread5 extends Thread {
    @Override
    public  void run()
    {
        int i=0;
        while(i<21) {
            System.out.println("hhhhhhhhhhhhhhhhhhhhhhh ");
            i++;
        }
        System.out.println("Thanks for Running Thread 2!!!");
    }

}
public class Ch_13_04_ThreadMethod {
    public static void main(String[] args) {
MyThread4 t1 =new MyThread4();
MyThread5 t2 = new MyThread5();
        t1.start();
//        try{
////            t1.join();
////        }
////        catch (Exception e) {
////            System.out.println(e);
////        }
        t2.start();
    }

}
