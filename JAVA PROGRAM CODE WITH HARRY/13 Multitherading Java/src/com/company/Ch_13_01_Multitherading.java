package com.company;

class MyThread1 extends Thread {
    @Override
    public  void run()
    {
        while(true) {
            System.out.println("My Thread1 is Running and I'm Happy !! ");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public  void run()
    {
        while(true) {
            System.out.println("My Thread2 is Running and I'm Sad !! ");
        }
    }
}
public class Ch_13_01_Multitherading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
