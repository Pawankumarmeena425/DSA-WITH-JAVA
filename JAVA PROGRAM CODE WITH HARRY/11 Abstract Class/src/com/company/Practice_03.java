package com.company;

class Monkey{
   void Jump(){
       System.out.println("Monkey Is Jammping Japa Ki Jampping..........");
    }
    void bite(){
        System.out.println("Monkey is Biting Something........");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
  public   void eat(){
      System.out.println("AAdmi KKa Rha hai!!!!!!");
    }
    public void sleep() {

        System.out.println("AADmi  So Rha hai!!!");
    }
}
public class Practice_03  {
    public static void main(String[] args) {
        Human h = new Human();
        h.bite();
        h.Jump();
        h.eat();
        h.sleep();
    }
}
