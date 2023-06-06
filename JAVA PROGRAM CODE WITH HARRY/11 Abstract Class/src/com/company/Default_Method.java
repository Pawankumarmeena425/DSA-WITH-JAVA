package com.company;
import com.sun.security.jgss.GSSUtil;
interface MyCamera{
    void takesnap();
    void recordvideo();

//    void record4kVideo(); /*If we create the method by this way then we must be implemenet this in everywhere
//    where it is use */
    private void abc(){
        System.out.println("It Private Method");
    }
    default void Record4k(){
        abc();
        System.out.println("Recording the 4k Video....");
    }

}
interface  Mywifi{

    String[] getNetworks();
    void connectNetwork(String Network);
}
class  MyMycellphone{
    void CallNumber(long phonenumber){
        System.out.println("Calling "+phonenumber);
    }
    void PickCall()
    {
        System.out.println("Connecting.... ");
    }
}
class  MySmartPone extends MyMycellphone implements  MyCamera, Mywifi
{
//   public void Record4k(){
//        System.out.println("Recording the 4k Video....");
//    }
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
public class Default_Method extends Main
{
    public static void main(String[] args) {
        MySmartPone sp = new MySmartPone();
        String[] arr = sp.getNetworks();
        for (String element:arr) {
            System.out.println(element);
        }
        sp.connectNetwork("Pawan Kumar");
       sp.recordvideo();
       sp.Record4k();
       sp.CallNumber(5464);

    }
}
