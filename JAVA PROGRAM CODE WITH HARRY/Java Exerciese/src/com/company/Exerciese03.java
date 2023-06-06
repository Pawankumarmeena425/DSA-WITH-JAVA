package com.company;
import java.util.Random;
import java.util.Scanner;
class Game
{
    int noofguss =0;
    int number,takenum;
public Game()
{
    Random num = new Random();
  number = num.nextInt(100);
//        It will generate random number between 1 to 99
}
public void takeinput()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Guess the number::");
  takenum = sc.nextInt();
}
public boolean IsCurrect()
{
    noofguss++;
    if (number==takenum)
    {
        System.out.printf("Yes You gusses the right number, it was %d\nYou guess in %d attempt!!",number,noofguss);
        return true;
    }
    else if (number>takenum)
    {
        System.out.println("Less the number!! Please choose the big number.");
    }
    else if (number<takenum)
    {
        System.out.println("Big the number!! Please choose the small number.");
    }
    return false;

 }
}
public class Exerciese03 {
    public static void main(String[] args) {
        /*
        Create a class game,which allows a user to play "Guess the Number" game once.
         Game should have the following methods::
         1. Constructor to generate the random number.
         2. takeuserinput() to take a user input of number
         3. iscorrectnmber() to detect whether the number by the user is true
         4. getter and setter for noofgusses
         Use properties such as noOfguess(int ),etc to get this task done::*/
        Game object = new Game();
boolean b = false;
while(!b)
{
 object.takeinput();
 b = object.IsCurrect();
}

    }
}
