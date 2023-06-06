package com.company;

public class PracticeSet01 {
    public static void main(String[] args) {
/*Create a array of 5 float and calculate their sum*/
float []marks = {3.2f,3.2f,424.3f,234.3f,334.32f};
//    By default float is considered as a double if we don't use 'f' after the value in that case it will
//    through error
    float sum=0;
  for (int i=0;i< marks.length;i++)
  {
      sum = sum+marks[i];
  }
//  Sum using the foreach loop
//        for (float element:marks) {
//            sum =sum+element;
//        }
        System.out.println("Sum of the all floating point array element is "+sum);
    }

}
