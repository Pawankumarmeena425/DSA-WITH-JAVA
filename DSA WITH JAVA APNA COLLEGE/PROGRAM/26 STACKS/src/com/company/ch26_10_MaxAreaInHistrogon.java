
package com.company;
import java.util.Stack;
public class ch26_10_MaxAreaInHistrogon {
    public static int maxAresHistrogon(int arr[]){
        Stack<Integer>s = new Stack<>();
        int rsmall[]=new int[arr.length];
        int lsmall[]=new int[arr.length];

//        Right Smaller in the arrray   --->>>. {1,N,2,2,N,N}
                for(int i = arr.length-1;i>=0;i--){
                    int curr = arr[i];
                    while(!s.isEmpty()&&curr<=arr[s.peek()]){
                        s.pop();
                    }
                    if(s.isEmpty()){
                        rsmall[i]= arr.length;
                        s.push(i);
                    }
                    else{
                        rsmall[i]=s.peek();
                        s.push(i);
                    }
                }
//Clear stack
        s.clear();
//                Left smaller in the array   ---->>>  {-1,-1,1,5,1,2};
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            while (!s.isEmpty()&&curr<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                lsmall[i]=-1;
            s.push(i);
            }
            else{
                lsmall[i]=s.peek();
                s.push(i);
            }
        }
        int max = 0;
//        maximum area
        for(int i=0;i<arr.length;i++){
            int width = rsmall[i]-lsmall[i]-1;
            int area = arr[i]*width;
     max = Math.max(max,area);
        }
        return max;

    }
    public static void main(String[] args) {
        int heights[]={2,1,5,6,2,3};

        System.out.println(maxAresHistrogon(heights));
    }
}
