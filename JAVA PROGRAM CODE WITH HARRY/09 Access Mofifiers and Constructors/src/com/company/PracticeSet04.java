package com.company;

class Constructor
{
    private int  length,breadth;

    public Constructor() {
        this.length = 4;
        this.breadth = 5;
    }
    public Constructor(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class PracticeSet04 {
    public static void main(String[] args) {
        /*Overload a constructor used to initialize a rectangle of lengh 4 and breadth 5 for using custom parameter*/
        Constructor c = new Constructor(765,3);
        System.out.println("Length  of the rectangle :: "+c.getLength());
        System.out.println("breadth of the rectangle :: "+c.getBreadth());
    }
}
