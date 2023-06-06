package com.company;
class  MyMainCylinder
{
    private int radius,height;
//    public MyMainCylinder(int h, int r)
//    {
//        radius =r;
//        height= h;
//    }


    public MyMainCylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}
public class PracticeSet03 {
    public static void main(String[] args) {
        /*Use a  constructor and repeat 1*/
        MyMainCylinder c = new MyMainCylinder(3,4);
        System.out.println("Radius of the Cylinder :: "+c.getRadius());
        System.out.println("Height of the Cylinder :: "+c.getHeight());
    }
}
