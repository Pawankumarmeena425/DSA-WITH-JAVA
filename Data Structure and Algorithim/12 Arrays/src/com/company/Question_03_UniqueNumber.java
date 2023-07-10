package com.company;

public class Question_03_UniqueNumber {
    public static void unique(int num[]){
       int  uniq = 0;
//        for (int i=0;i<num.length;i++){
//            if (uniq!=0){
//                break;
//            }
//            for (int j=0;j<num.length;j++){
//                if (num[i]==num[j]&&i!=j){
//                    break;
//                }
//               if (j==num.length-1){
//                   uniq = num[i];
//               }
//            }
//        }

//       2nd Alternative better approach
        for (int i=0;i<num.length;i++){
            uniq = uniq^num[i];
        }
        System.out.println("Unique Number in the array = "+uniq);
    }
    public static void main(String[] args) {
        int num[]={4,5,4,5,6,1,7,6,7};
        unique(num);
    }
}
