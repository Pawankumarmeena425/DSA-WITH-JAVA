package com.company;

import java.util.Scanner;
class MaxReteries extends Exception{
    @Override
    public String toString(){
        return  " Entered index is out of Bound!!";
    }
    @Override
    public String getMessage(){
        return "Pls enter the valid index!!";
    }
}

//public class arrayException {
//    public static void array(int index)throws MyExeption1 {
//        if (index < 7) {
//            try {
//                throw new MyExeption1();
//            }
//        }
//
//    }
//}
public class Ch_14_Practice_Set_04 {
    public static void main(String[] args) {
//        MOdify Program 3 to throw a custom Exception if max retries are reached.
        int []marks = {23,21,312,3,2,32,1};
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the array index, Which you want to access!!");
            int index = sc.nextInt();
            if(index>6)
            try {
                throw new MaxReteries();
            } catch (Exception e) {
                System.out.println("Something error Occured!!");
                System.out.println(e.toString());
                System.out.println(e.getMessage());
             break;
            }
        }

        }
}
