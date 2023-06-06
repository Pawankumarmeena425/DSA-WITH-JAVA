package com.company;

public class PracticeSet06 {
    static float aveg(int ...arr)
    {
        int n=0;
        int total=0;
        for (int element:arr)
        {
        total+=element;
        n++;
        }
        return (float) total/n;
    }
    public static void main(String[] args) {
        /*Wrtie a function to find average of a set of numbers passed as arguments*/
        float val=aveg(5,2,7,8,9,12,31,2);
        System.out.println("Average of the given set of number is :: "+val);
    }
}
