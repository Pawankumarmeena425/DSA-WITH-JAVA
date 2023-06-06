package com.company;
import java.util.Scanner;
public class PracticeSet03 {
    public static void main(String[] args) {
        /*Calculate income tax paid by an employee to the government as per teh slots mentions below.
        *  for 2.5L to 5.0L 5%
        *  for 5.0L to 10.0L 20%
        *  Above 10.0L 30%
        * Note that there is no tax below 2.5L . Take input amout as an input from the user*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee Salary!!!");
        long sal = sc.nextLong();
        float tax=0;
        if(sal<250000){
            tax=0;

        }
       else if (sal>=250000 && sal<=500000){
            tax  = (sal-250000)*5/100;

        }
       else if (sal>=500000 && sal<=1000000){
            tax  = (500000-250000)*5/100;
            tax  = tax+(sal-500000)*20/100;

        }
       else{
            tax  = (500000-250000)*5/100;
            tax  =  tax+(1000000-500000)*5/100;
            tax  = tax+(sal-1000000)*30/100;
        }
        System.out.println("Total Amount that paid by the employee!!");
        System.out.println(tax);
    }
}
