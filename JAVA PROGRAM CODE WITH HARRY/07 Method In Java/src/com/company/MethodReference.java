package com.company;

public class MethodReference {
    static void change(int a)
    {
        a=234;
    }
    static void change2(int []arr)
    {
        arr[0]=2344;
        arr[3]=342;
    }
    public static void main(String[] args) {
//       ***** Case 1: Changing the integer ********
        int x=324;
        change(x);
        System.out.println("The value of x after running the change function::"+x);


//        **** Case 2: Changing the array ****
        int []arr={43,2,343,43,4,21,23,43,4,3,4,32};
        change2(arr);
        System.out.println("The value of array at 0th index :: "+arr[0]);
        System.out.println("The value of array at 3th index :: "+arr[3]);
        System.out.println("The value of array at 2th index :: "+arr[4]);


/*        ************ In the case of integer the copy of integer pass in the change function so no change reflicted
*       in the main function .
*       But in the case of array copy of reference is pass in the change function so change reflicted in the
*       main function ******************    */

    }
}
