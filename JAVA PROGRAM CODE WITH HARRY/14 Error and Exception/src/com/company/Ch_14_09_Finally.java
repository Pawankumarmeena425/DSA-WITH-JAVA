package com.company;

public class Ch_14_09_Finally {

    public static int greet(){
        try {
            int a =32;
            int  b = 0;
            System.out.println("Good Morning!!");
            int c  =a/b;
//-----------<<<<<<<<<< It's give an Excepiton and it must be return here. But it will also excuted finally block also
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up the resources..............This is end of the function!!");
//            ----------<<<<<<< If we don't declare it in the finally then it will not excute
        }
        return 0;
    }
    public static void main(String[] args) {
        greet();
    }
}
