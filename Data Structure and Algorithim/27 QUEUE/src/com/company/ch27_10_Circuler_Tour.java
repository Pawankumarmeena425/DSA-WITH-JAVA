package com.company;

public class ch27_10_Circuler_Tour {
   static int  tour(int petrol[], int distance[])
    {
        // Your code here
        int kami = 0;
        int balance = 0;
        int start=0;
        for(int i=0;i<petrol.length;i++){
            balance += petrol[i] - distance[i];
            if(balance<0){
                kami += balance;
                balance = 0;
                start = i+1;
            }
        }
        if(balance+kami>=0){ // yedi jo kami rah gai , thi uthan age wale tour me extra fuel hai , to possible hoga nahi to possible nahi hoga
            return start;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int petrol[] = {4 ,6, 7 ,4};
        int distance[] = {6 ,5 ,3 ,5};
        System.out.println(tour(petrol,distance));
    }
}
