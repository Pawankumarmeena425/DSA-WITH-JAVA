package com.company;

public class Question_06_AllDuplicateElements {
    public static void Duplicate(int[] num){
        int dup[]=new int[num.length];
        int k=0;
        for (int i=0;i<num.length;i++){
            for (int j=0;j<num.length;j++){
                if (num[i]==dup[j]){
                    break;
                }
                else {
                    if (i!=j){
                        if (num[i]==num[j]){
                            dup[k]=num[i];
                            k++;
                            break;
                        }
                    }
                }
            }
        }
     for (int i=0;i<k;i++){
         System.out.print(dup[i]+" ");
     }
    }
    public static void main(String[] args) {
        int num[]={1,2,4,5,3,4,5,2,5,8,6,9,0,6,9,3,};
        Duplicate(num);

    }
}
