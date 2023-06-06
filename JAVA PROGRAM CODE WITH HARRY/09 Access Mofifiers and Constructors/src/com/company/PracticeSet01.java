package com.company;

class Cylinder
{
    private int  radius,height;


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class PracticeSet01 {
    public static void main(String[] args) {
        /* Create a class  Cylindar and use getter and setter to set its radius and height*/
        Cylinder c = new Cylinder();
        c.setHeight(2);
        c.setRadius(5);
        System.out.println("Height of the Cylinder is ::"+c.getHeight());
        System.out.println("Radius of the Cylinder is ::"+c.getRadius());
    }
}
