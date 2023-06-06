package com.company;

interface Bicycle{
    int a=4;
    void  applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void lowhorn();
    void highhorn();
}


/*Interface can be implement more than one . But abstract class and normal class can't extend more then one*/
class AvonCycle implements Bicycle,HornBicycle{
    void sound ()
    {
        System.out.printf("Pee Pee Poo Poo...");
    }
   public void applyBreak(int decrement)
   {
       System.out.println("Apply Break!!"+decrement);
   }
    public void speedUp(int increment)
    {
        System.out.println("Speed Bust!!"+increment);
    }
    public void lowhorn(){
        System.out.println("Apply low horn!!!");
    }
   public void highhorn(){
       System.out.println("Apply high horn!!");
    }
}
public class InterfaceInJava {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBreak(2);
        cycle.speedUp(3);
        cycle.highhorn();
        cycle.lowhorn();
//        We can create properties in the interfaces and access them
        System.out.println(cycle.a);
//        You can't modify the properties in the Interfaces as they are final by default
//        >>>>>>>>>>>>> cycle.a = 324;<<<<<<<<<<<<<<<<<<<<<
    }
}
