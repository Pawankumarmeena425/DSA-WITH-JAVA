package com.company;

class MyCylinder
{
    private int  radius,height;
private double area,volume;
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume() {
        volume = Math.PI*radius*radius*height;
        return volume;
    }
    public double getArea() {
        area = 2*Math.PI*radius*(radius+height);
        return area;
    }
}
public class PracticeSet02 {
    public static void main(String[] args) {
        /*Use 1 to calculate the Surface area and volume of the cylinder*/
        MyCylinder c = new  MyCylinder();
        c.setHeight(2);
        c.setRadius(5);
        System.out.println("Surface Area of the Cylinder is ::"+c.getArea());
        System.out.println("Volume  of the Cylinder is ::"+c.getVolume());
    }
}
