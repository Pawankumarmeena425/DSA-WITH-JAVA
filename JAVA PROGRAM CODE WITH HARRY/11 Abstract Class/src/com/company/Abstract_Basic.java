package com.company;

abstract class Parent {
    public Parent(){
        System.out.println("I am constructors of parent class!!!");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends Parent
{
    @Override
    public void greet(){
        System.out.println("Good Morning!!");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon!!");
    }
}
class child2 extends child
{
    public void fo()
    {
        System.out.println("I am in the  child2 class!! ");
    }
}
//abstract class child2 extends Parent
//{
//   public void fo()
//   {
//       System.out.println("I am in the  child2 class!! ");
//   }
//}
public class Abstract_Basic {
    public static void main(String[] args) {
//child c = new child();
//c.greet();
//c.greet2();
child2 ch= new child2();
ch.greet();
ch.greet2();
ch.fo();
//Parent p = new Parent();   /*We can't create object of abstrent the abstract method */
//        child2 c2 = new child2() ;  /*We can't create object of the Childact class without implem2 class because abstract method don't implemet
//        */
//        We can create Object of Concert Class Only(Implement all abstract method)


    }
}
