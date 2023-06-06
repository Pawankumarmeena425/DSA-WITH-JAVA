package com.company;
class Rectangle
{
int length , breadth;
int area,volume;

    public Rectangle()
    {
        System.out.println("This no parameter cunstructors::");
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getAreaR
            () {
        return length*breadth;
    }

    public int getVolumeR() {
        return 2*(length+breadth);
    }
}
class Cuboid extends Rectangle
{
    int height;

    Cuboid(int l,int b, int h)
    {
        super(l,b);
        this.height = h;
    }
    int area,volume;

    public int getAreaC() {
        return 2*length*breadth+2*breadth*height+2*length*height;
    }

    public int getVolumeC() {
        return length*breadth*height;
    }
}
public class PracticeSet02_04 {
    public static void main(String[] args) {
        /*Create a class Rectangle and use in inheritance to create another class cuboid. Create Method for area and
        * volume. Also create getter and setter*/
Cuboid c = new Cuboid(3,2,1);
        System.out.println(c.getAreaR()+"\n"+c.getVolumeR()+"\n"+c.getAreaC()+"\n"+c.getVolumeC());
    }
}
