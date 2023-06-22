package com.company;

public class ch34_05_MinimumTime {
    public static int minimumTime(int N,int K,int arr[]){
        int num[] = new int[N];
      for(int i=0;i<arr.length;i++){
          num[arr[i]-1] = 1;
      }
      boolean b = true;
      int count=0;
      while(b) {
          b = false;
          for(int i=0;i<num.length;i++){
              if(num[i]==0){
                  b = true;
              }
              else{
                  if(i==0){
                      num[i+1] =1;
                  }
                  else if(i==num.length-1){
                      num[i-1]=1;
                  }
                  else{
                      num[i+1]=1;
                      num[i-1]=1;
                  }
              }
          }
          count++;
      }
        return count;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(minimumTime(5,5,arr));
    }

}
