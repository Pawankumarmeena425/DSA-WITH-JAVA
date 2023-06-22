package com.company;

public class ch22_02_Subset_In_String {
    public  static void printSubSets(String str,String ans,int i){
//        Base Case
        if(i==str.length()){
            System.out.println(ans);

            return ;

        }
//        Choic YES
        printSubSets(str,ans+str.charAt(i),i+1);
//        choice NO
        printSubSets(str,ans,i+1);

    }

    public static void main(String[] args) {
        String str ="abc";
        printSubSets(str,"",0);

    }
}
