package com.company;
class Employee
{
    int id;
    int salary;
    String name;
    public void printdeatils()
    {
        System.out.println("My id is :: "+id);
        System.out.println("My name is :: "+name);
    }
   public int  getsalary(){
        return  salary;
   }
}
// If we use public before the class in that case it will through error

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class::");
        Employee pawan = new Employee();
        //    Instantiating a new Employee Object
        Employee rohan = new Employee();
        Employee shubham = new Employee();


//        Setting Properties / Atributes
        pawan.id = 234;
        pawan.salary = 313213;
        pawan.name = "PawanKumarMeena";
        rohan.id =3544;
        rohan.salary =3535344;
        rohan.name = "Rohan Sharma";
        shubham.id = 6767;
        shubham.salary = 69655437;
        shubham.name = "Shubham Kumar Meena";
//        Printing the Properties Or atributes
//        System.out.println(pawan.id);
//        System.out.println(pawan.name);
        /*We can make easy it printing by creating method in the employee class */
        pawan.printdeatils();
        rohan.printdeatils();
        shubham.printdeatils();
        int salary = pawan.getsalary();
        System.out.println(salary);
    }

}
