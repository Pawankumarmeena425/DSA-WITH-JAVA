package com.company;
import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Seccior_Game {
    public static void main(String[] args) {
Random num  = new Random();
Scanner sc = new Scanner(System.in);
        int ran, choice, i=1;
      int com=0,user=0;

        while(i<=5)
        {
            ran = num.nextInt(3)+1;
//            num.nextInt(3) , It will generate random number between 0 to 2
            System.out.println("\nChoose number 1,2,3(1 for rock, 2 for paper,3 for seccior)!!");
            choice = sc.nextInt();
            if (choice==1)
            {
                if (ran==1)
                {
                    System.out.printf("%d match tie up!!",i);
                }
                else if (ran==2)
                {
                    System.out.printf("Computer win %d match!!",i);
                    com++;
                }
                else
                {
                    System.out.printf("User win the %d match!!",i);
                    user++;
                }
            }
           else if (choice==2)
            {
                if (ran==2)
                {
                    System.out.printf("%d match tie up!!",i);
                }
                else if (ran==3)
                {
                    System.out.printf("Computer win %d match!!",i);
                    com++;
                }
                else
                {
                    System.out.printf("User win the %d match!!",i);
                    user++;
                }
            }
            else if (choice==3)
            {
                if (ran==3)
                {
                    System.out.printf("%d match tie up!!",i);
                }
                else if (ran==1)
                {
                    System.out.printf("Computer win %d match!!",i);
                    com++;
                }
                else
                {
                    System.out.printf("User win the %d match!!",i);
                    user++;
                }
            }
            else
            {
                System.out.println("User choose the wrong choice! Please Choose the right choice!!");
                continue;
            }
            System.out.printf("\nComputer choose ="+ran);
            i++;
        }
        if (com>user)
        {
            System.out.println("\nComputer win the series!!");
        }
        else if (user>com)
        {
            System.out.println("\nUser win the series!!");
        }
       else
        {
            System.out.println("\nNo one Win the Match!!");
        }

    }
}
