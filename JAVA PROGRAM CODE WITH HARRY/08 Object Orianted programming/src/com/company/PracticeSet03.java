package com.company;

class  Squre
{
    int side;
    public int area()
    {
        return side*side;
    }
    public int permiter()
    {
        return 4*side;
    }
}
public class PracticeSet03 {
    public static void main(String[] args) {
        /*Create a class squre with a method to initialize its side, calculating area, perimeter etc.*/
        Squre home = new Squre();
        home.side = 5;
        System.out.println("Area of the Home is :: "+home.area());
        System.out.println("Permiter of the Home is :: "+home.permiter());
    }
}
