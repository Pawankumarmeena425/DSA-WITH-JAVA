package com.company;

class CellPhone
{
    public void ring(){
        System.out.println("Ringing......");
    }
    public void vibr(){
        System.out.println("vibrating......");
    }
    public void call(){
        System.out.println("Calling to a Friends......");
    }
}
public class PracticeSet02 {
    public static void main(String[] args) {
        /*Create a class cellphone with methods to print "ringing....", " Vibating..." etc*/
        CellPhone vivo = new CellPhone();
        vivo.call();
        vivo.ring();
        vivo.vibr();
    }
}
