package com.company;
import java.util.*;
public class ch23_03_PairSum_SortedandRotated {
public static boolean pairsSumInSortedRotated(ArrayList<Integer>arr,int target){
    int pivot=0;
    for(int i=0;i<arr.size()-1;i++){
        if(arr.get(i)>arr.get(i+1)){
            pivot = i;
            break;
        }
    }
//    1st better way for checking
    int rp = pivot;
    int lp = pivot+1;
    int n =arr.size();
        while(arr.get(rp)>arr.get(lp)){

      int result = arr.get(rp)+arr.get(lp);
      if(result==target){
          System.out.println("Pairs = "+rp+" , "+lp);
          return true;
      }
//      Increase lp in the rotated form
      else if(target>result){
          lp = (lp+1)%n;
      }
//      Decreasing rp in the rotated form
            else{
                rp = (n+rp-1)%n;
      }
    }
//    2nd way  for checking
//    Check in which part we require search
//   int max = pivot;
//    int min = pivot+1;
//    while(arr.get(max)>arr.get(min)){
//        int result = arr.get(max)+arr.get(min);
//        if(target==result){
//            System.out.println("Pairs = "+min+" , "+max);
//            return true;
//        }
//        else  if(target>result){
//            min++;
//        }
//        else{
//            max--;
//        }
//
//        if(max==-1){
//            max = arr.size()-1;
//        }
//        if(min==arr.size()){
//            min=0;
//        }
//    }
    return false;
}
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(11);
    arr.add(15);
    arr.add(6);
    arr.add(8);
    arr.add(9);
    arr.add(10);
        System.out.println(pairsSumInSortedRotated(arr,14)); ;


    }
}
