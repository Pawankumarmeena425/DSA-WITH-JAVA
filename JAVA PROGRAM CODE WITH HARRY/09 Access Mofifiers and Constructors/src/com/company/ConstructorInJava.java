package com.company;
class MyMainEmployee
{
    private  int id;
    private String name;

    public MyMainEmployee()
    {
        id=324;
        name = "Your Name Hare";
    }
    public MyMainEmployee(String n, int val)
    {
        id=val;
        name = n;
    }



    public void setname(String n)
    {
        name = n;
    }
    public void setid(int num)
    {
        id = num;
    }
    public String getname()
    {
        return name;
    }
    public int getid()
    {
        return id;
    }
}
public class ConstructorInJava {
    public static void main(String[] args) {
        MyMainEmployee pawan = new MyMainEmployee("Pawan Is a Good Boy",235252);


//        pawan.setname("Pawan Kumar Meena");
//        pawan.setid(23432);
        System.out.println( pawan.getname());
        System.out.println(pawan.getid());
    }
}
