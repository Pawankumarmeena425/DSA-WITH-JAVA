package com.company;

class Base1 {


    Base1() {
        System.out.println("I am a base class constructors!!!");
    }
    Base1(int a)
    {
        System.out.println("I am a overloaded constructors of base class with value of x :: "+a);
    }
}
class Derived1 extends Base1{

 Derived1()
 {
//     super(0);
     System.out.println("I am a derived class constructors!!");
 }
    Derived1(int x, int y)
    {
        super(x);
        System.out.println("I am a overloaded constructors of derived class with value y as :"+y);
    }

}
class ChildOfDrived extends Derived1{
    ChildOfDrived()
    {
        System.out.println("I am a Child of derived class constructors!!");
    }
    ChildOfDrived(int x,int y, int z){
        super(x,y);
        System.out.println("I am a overloaded constructors of derived class with value z as :"+z);
    }
}
public class Constructores_In_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//Derived1 d = new Derived1();
//Derived1 d = new Derived1(5,4);
//ChildOfDrived cd = new ChildOfDrived();
//ChildOfDrived cd = new ChildOfDrived(12,4,5 );
ChildOfDrived cd = new ChildOfDrived(2,4,7);
    }

}
