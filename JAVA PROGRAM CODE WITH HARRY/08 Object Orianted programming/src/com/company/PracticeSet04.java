package com.company;
class Rectangle
{
    int length,breadth;
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length*breadth);
    }
}
public class PracticeSet04 {
    public static void main(String[] args) {
Rectangle rec = new Rectangle();
rec.breadth=5;
rec.length=3;
        System.out.println("The Area of the Rectangle is :: "+rec.area());
        System.out.println("The Area of the Perimeter is :: "+rec.perimeter());
    }
}
