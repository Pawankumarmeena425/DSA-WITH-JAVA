package com.company;
 class  Circle
 {
     int  radius;
     public float area()
     {
         return 3.14f*radius*radius ;
     }
     public float perimeter()
     {
         return 2*3.14f*radius ;
     }
 }
public class PracticeSet06 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5;
        System.out.println("Area of the Circle is :: "+c.area());
        System.out.println("Area of the Perimeter is :: "+c.perimeter());
    }
}
