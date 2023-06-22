package com.company;

public class ch19_14_ReverseString {

//    1st Way
//    public static String reverseString(String str,int ei,StringBuilder sb){
//        sb.append(str.charAt(ei));
//        if (ei==0){
//            return sb.toString();
//        }
//        return reverseString(str,ei-1,sb);
//    }

// 2nd Better Way

    public static String reverseStringB(char []ch,int si,int ei){
        if (si>ei){
            String str = new String(ch);
            return str;
        }
        char  temp = ch[si];
        ch[si]=ch[ei];
        ch[ei]=temp;
       return  reverseStringB(ch,si+1,ei-1);

    }
    public static void main(String[] args) {
        String s = "Pawan kumar meena";
        StringBuilder sb = new StringBuilder(s);
      char ch[] = s.toCharArray();
        System.out.println(reverseStringB(ch,0,ch.length-1));

    }
}
