package com.company;

public class SplitString {
    public static void main(String[] args) {
        String cars = "Hyundai, Maruti, Swift, Wagnor , Ferrari,Lamborgini";
        String allcars[]=cars.split(",");
        for (String car:allcars) {
            System.out.println(car);
        }
    }
}
