package com.company;

import com.sun.security.jgss.GSSUtil;

interface Camera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good Morning !!! ");
    }
    default void Record4k(){
        greet();
        System.out.println("Recording the 4k Video....");
    }

}
interface wifi{
    String[] getNetworks();
    void connectNetwork(String Network);
}
class Mycellphone{
    void CallNumber(int phonenumber){
        System.out.println("Calling "+phonenumber);
    }
    void PickCall()
    {
        System.out.println("Connecting.... ");
    }
}

class SmartPone extends Mycellphone implements Camera,wifi
{
   public void Record4k(){
        System.out.println("Recording the 4k Video in the Smartphone....");
    }

    public void takesnap(){
        System.out.println("Taking Snap...");
    }
   public void recordvideo()
    {
        System.out.println("Recording the Video....");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks!!");
        String[] NetworkList =  {"Pawan","Harry","Akashat"};
        return NetworkList;
    }
   public void connectNetwork(String Network)
    {
        System.out.println("Connecting to the "+Network);
    }
}
public class Inerfaces_Example {
    public static void main(String[] args) {
        SmartPone sp = new SmartPone();
        String[] arr = sp.getNetworks();
        for (String element:arr) {
            System.out.println(element);
        }
        sp.connectNetwork("Pawan Kumar");
        sp.Record4k();
//        sp.greet();  ----<<< WE con't use greet direclty as this is private

    }
}
