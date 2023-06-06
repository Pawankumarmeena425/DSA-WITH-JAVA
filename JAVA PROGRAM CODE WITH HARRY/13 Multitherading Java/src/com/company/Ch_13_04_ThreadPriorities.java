package com.company;
class Mythre extends Thread
{
    public Mythre(String name){
        super(name);

    }
    public void run(){
        int i=0;
while (i<5)
//            System.out.println("I am in the Thread Constructore !!! ");
        System.out.println("And My thread Name is "+this.getName());

i++;
    }
}

public class Ch_13_04_ThreadPriorities {
    public static void main(String[] args) {
        Mythre t1 = new Mythre("Harry1");
        Mythre t2 = new Mythre("Harry2");
        Mythre t3 = new Mythre("Harry3");
        Mythre t4 = new Mythre("Harry4(most Important)");
        Mythre t5= new Mythre("Harry5");
        Mythre t6 = new Mythre("Harry6");
        t4.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
