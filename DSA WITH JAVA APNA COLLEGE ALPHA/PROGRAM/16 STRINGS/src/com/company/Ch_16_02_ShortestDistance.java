package com.company;

public class Ch_16_02_ShortestDistance {
    public static double shortestDis(String str){

        int x=0,y=0;
//        Starting positin is origion
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='E'){
                x++;
            }
            else if (str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else{
                y--;
            }
        }
//Starting position is origion
//        --->> Shortest distance = squre root{(x2-x1)2+(y2-y1)2}
       double dis=  Math.sqrt(x*x+y*y);
                return dis;
    }
    public static void main(String[] args) {
        String dir = new String("WNEENESENNNENSWSEN");

        System.out.println( shortestDis(dir));
    }
}
