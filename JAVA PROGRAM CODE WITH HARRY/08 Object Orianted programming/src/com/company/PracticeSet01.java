package com.company;
// If we make class name Employee in that it will give error. Because in the com.company package already Employee calss defined
class Employee1
{
   int salary ;
   String name;
   public int getSalary()
   {
       return salary;
   }

   public String getName()
   {
       return name;
   }
    public void setName(String n)
    {
        name = n;
    }
}
public class PracticeSet01 {
    public static void main(String[] args) {

        Employee1 pawan = new Employee1();
        pawan.salary= 2345;
//        pawan.name="Pawan Kumar meena";
        pawan.setName("Pawan Kumar meena");
//        If we don't set name then it wil print the nul
        System.out.println(pawan.getName());
        System.out.println(pawan.getSalary());



    }
}
