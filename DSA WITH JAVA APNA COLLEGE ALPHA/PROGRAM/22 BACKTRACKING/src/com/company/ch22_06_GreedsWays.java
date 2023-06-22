package com.company;

public class ch22_06_GreedsWays {
    public static int gridWays(int xi,int yi,int xf,int yf){
//       BAse Case : When initial point and final point is equal
//        target poin condition
        if(xi==xf-1&&yi==yf-1){
            return 1;
        }
//        Boundary cross condition
        else if(xi==xf||yi==yf){
            return 0;
        }
//       go  Right
        int w1 = gridWays(xi,yi+1,xf,yf);
//        go down
        int w2 =  gridWays(xi+1,yi,xf,yf);
        return w1+w2;
    }
    public static void main(String[] args) {
        System.out.println("Total number of ways to reach the target :: "+gridWays(0,0,3,3));
    }
}
