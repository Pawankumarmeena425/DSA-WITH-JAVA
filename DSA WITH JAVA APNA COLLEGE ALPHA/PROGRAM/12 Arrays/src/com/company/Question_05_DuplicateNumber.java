package com.company;

public class Question_05_DuplicateNumber {
    public static void main(String[] args) {
        int num[]={1,3,2,4,5,6,3};
        int dup=0;
//        for (int i=0;i<num.length;i++){
////            if (dup!=0){
////                break;
////            }
////            for (int j=0;j<num.length;j++){
////                if (i!=j){
////                    if (num[i]==num[j]){
////                        dup = num[i];
////                        break;
////                    }
////                }
////            }
////        }

//        2nd Alternative better approach

        for(int i=0;i<num.length;i++){
            dup = dup^num[i];
        }
//       Because values lay form 1 to N-1. N-1 ---->>>> because one elements are repeated and we findout that
        for(int i=1;i<num.length;i++){
            dup = dup^i;
        }

        System.out.println("Duplicate Number in the array = "+dup);
    }
}
