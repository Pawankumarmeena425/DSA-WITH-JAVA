package com.company;

public class VariablesArguments {
//    static int sum(int a,int b)
//    {
//        return a+b;
//    }
//    static int sum(int a,int b,int c)
//    {
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d)
//    {
//        return a+b+c+d;
//    }

    /* But when we don't know how many argument are passed in that case we use variable argument*/
static int sum(int ...arr)
{
//    It availabe as int []arr
    int result =0;
    for (int a:arr) {
        result = result+a;
    }
    return result;
}
    static int bar(int x,int ...arr)
    {

        int result =x;
        for (int a:arr) {
            result = result+a;
        }
        return result;
//        ***In  this function variable argument one argumetn must be passed otherwise it will through error
    }
// In the variable argument we can pass infinite perameter that work same task


    public static void main(String[] args) {
        System.out.println("The sum of 5 and 8 is :: "+sum(5,8));
        System.out.println("The sum of 5 ,4 and 3 is :: "+sum(5,4,3));
        System.out.println("The sum of 5 ,8,7 and 4 is :: "+sum(5,8,7,4));
        System.out.println("The sum of Nothing is :: "+sum());
        System.out.println("The result of bar function is :: "+bar(43));

    }
}
