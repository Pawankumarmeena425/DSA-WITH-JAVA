package com.company;

public class ch20_07_LengthOfString {
    public static int stringLength(String str, int si,int count){
        if (str.charAt(si)==0){
            return count;
        }
        count++;
        return stringLength(str, si+1,count);

    }
    public static void main(String[] args) {
        String str = "Pawan Kumar Meena";
        stringLength(str,0,0);
    }
}
