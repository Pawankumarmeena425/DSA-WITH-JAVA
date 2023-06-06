package com.company;

class MyThreadRunnable1 implements Runnable{
@Override
    public void run(){

        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");
        System.out.println(" I am in the tread 1!!! hhhhhhhh");

    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
        System.out.println(" I am in the tread 2!!! hhhhhhhh");
    }
}
public class Ch_13_02_Thread_Runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1 . start();
        gun2.start();

    }
}
