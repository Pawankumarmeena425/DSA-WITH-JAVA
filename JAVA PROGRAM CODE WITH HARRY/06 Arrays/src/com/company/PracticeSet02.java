package com.company;
import java.util.Scanner;
public class PracticeSet02 {
    public static void main(String[] args) {
        /*Write a program to find whether a given integer is persent in the array or not*/
        int []num ={5,2,683,8,323,235,3,7,54,433};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value which you want to search!!!");
        int val = sc.nextInt();
boolean val2=false;
        for (int i=0;i< num.length;i++)
        {
            if (num[i]==val)
            {
                val2 = true;
                break;
            }
        }
        if(val2)
        {
            System.out.printf("%d integer are available in the array!!",val);
        }
        else
        {
            System.out.printf("%d integer are not available in the array!!",val);
        }
    }
}
