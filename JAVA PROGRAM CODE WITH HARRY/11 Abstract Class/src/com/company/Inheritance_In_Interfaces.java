package com.company;

interface sampleclass {
    void math();
    void math2();
}
interface testsample extends sampleclass
{
    void math3();
    void math4();
}
class Mysample implements testsample{
 /* If we don't implement code of sampleclass abstract class then it will go error .
  Because testclass ectends smapleclass */


   public  void math()
    {
        System.out.println("This is math class");
    }

  public void math2()
    {
        System.out.println("This is math2 class!!");
    }
  public void math3()
    {
        System.out.println("This is math3 method!!");
    }
   public void math4()
   {
       System.out.println("This is math4 method!!");
   }
}
public class Inheritance_In_Interfaces {
    public static void main(String[] args) {
testsample s = new Mysample();
s.math2();
s.math();
s.math3();
s.math4();
//        sampleclass p = new Mysample();    /* If we create reference of the sampleclass then we can't access the
//        testclass method */
    }
}
