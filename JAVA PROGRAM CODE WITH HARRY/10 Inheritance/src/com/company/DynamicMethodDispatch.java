package com.company;
class Phone
{
    public void ShowTime()
    {
        System.out.println("Time is 8 A.M!!!");
    }
    public void on()
    {
        System.out.println("Switch on of the Phone!!");
    }
}

class SmartPhone extends Phone
{
    public void on()
    {
        System.out.println("Switch on of the SmartPhone!!");
    }
    public void off()
    {
        System.out.println("Switch off the Smartphone!!");
    }


}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
//        <<<<<< Here Phone is Reference and Smartphone is a Object
//        SmartPhone obj1 = new Phone();     -<<< Not Allowed
        obj.on();
//        <<<< Here on method run of Smartphone because we creater reference of the Smartphone
        obj.ShowTime();

//obj.off();    -<<<< Not Allowed , in the dynamic method dispatch only that method has called which
// are available in the super Class.

    }
}
