package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and  setting x now:::");
        this.x = x;
    }
    public void println()
    {
        System.out.println("I am  a not a constructor!!!");

    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
public class Inherantance_Basic {
    public static void main(String[] args) {
        Base b =  new Base();
//        Derived b = new Derived();
        /* We can create object of the Drived class and access the attributes of the Base class */
        b.setX(34);
//        we don't call the b.setY by the Base class , because drived class data not available in the base class
        System.out.println(b.getX());
        Derived d = new Derived();
        d.setY(4);
        d.setX(65);
        System.out.println(d.getX());
//        System.out.println(d.getY());

    }


}
