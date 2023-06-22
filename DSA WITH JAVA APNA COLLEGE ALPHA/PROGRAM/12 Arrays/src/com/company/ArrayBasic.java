package com.company;

import java.util.Scanner;

public class ArrayBasic {
    public static int  check(String StringArry[],String dish){
for (int i=0;i<StringArry.length;i++){
    if (StringArry[i].equals(dish)){
        return 1;
    }
}
return -1;
    }
    public static void main(String[] args) {
        String StringArry [] = {"Samosha","Kachori"," Cholhe",};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dish Which you want to Search!!");
        String dish = sc.nextLine();
        int val = check(StringArry,dish);
if (val==1){
    System.out.println(dish+" are Available in the Menu!!");
}
else {
    System.out.println(dish+" are not Available in the Menu!!");
}
    }
}
