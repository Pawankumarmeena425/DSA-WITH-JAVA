package com.company;

class Employee
{

    private  int id;
    private String name;

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
public class AccessModifiers {
    public static void main(String[] args) {
        Employee pawan = new Employee();

       /* pawan.id =423;
        pawan.name = "Pawan";
        >>>>>>>>>  It will give error due to priviate access modifier */
        pawan.setname("Pawan Kumar Meena");
        pawan.setid(23432);
        System.out.println( pawan.getname());
        System.out.println(pawan.getid());

    }
}
