package com.company;

class A{
    int a;
    public  int  pawan()
    {
        return 432;
    }
    public void meth2()
    {
        System.out.println("I am method 2 of class A::");
    }
}
class B extends A{
    @Override
    public void meth2()
    {
        System.out.println("I am method 2 of class B::");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
A a = new A();
B b = new B();
//a.meth2();
b.meth2();
    }
}
