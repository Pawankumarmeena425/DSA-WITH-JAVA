package com.company;

abstract class Pen{
  abstract   void write();
   abstract void refill();

}
class Reading extends Pen{
 void write(){
     System.out.println(" I am a Writer");
  };
    void refill()
    {
        System.out.println("I am a Refiller");
    }
}
public class Practice01 {
    public static void main(String[] args) {
   Pen p = new Reading();
   p.refill();
   p.write();
    }
}
