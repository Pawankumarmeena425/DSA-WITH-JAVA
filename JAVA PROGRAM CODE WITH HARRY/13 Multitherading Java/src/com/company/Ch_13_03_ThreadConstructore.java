package com.company;

import java.sql.SQLOutput;

class Mythr extends Thread
        {
          public Mythr(String name){
              super(name);
          }
          public void run(){
              int i=0;
              while (i<15){
                  System.out.println("I am in the Thread Constructore !!! ");
                  i++;
              }
          }
        }


public class Ch_13_03_ThreadConstructore {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Pawan");
        Mythr t2 = new Mythr("Rakesh");
        t1.start();
        t2.start();
        System.out.println("The id of thread t1 is " + t1.getId());
        System.out.println("The Name of thread t1 is " + t1.getName());
        System.out.println("The id of thread t2 is " + t2.getId());
        System.out.println("The Name of thread t2 is " + t2.getName());
    }
}
