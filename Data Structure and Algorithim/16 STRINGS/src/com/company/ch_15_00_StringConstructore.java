package com.company;

import java.lang.reflect.Array;

public class ch_15_00_StringConstructore {
    public static void main(String[] args) {
//        String s = new String();
//        System.out.println(s);
////        No Argument String Constructore
//        String s1= new String("Pawan");
//        System.out.println(s1);
////        String Constructore with Literal (Create 2 object)
//        StringBuilder sb = new StringBuilder("Rahul");
//        System.out.println(sb);
////        ---->>>>>>>> create 1 object
////        ----- Convert String Builder into String
//        String s2  = new String(sb);
//        System.out.println(s2);
//
//        StringBuffer sf  =new StringBuffer("Rohan");
////        Create only 1 object
//        s2 = new String(sf);
//        System.out.println(s2);
//
//
//        byte[]b={102,103,110,111};
//        String s3 = new String(b);
////Convert Byte array into string
//        System.out.println(s3);
//
//        char ch[] = {'a','h','f','i','b'};
//        String s4  =new String(ch);
//        System.out.println(s4);
//
//        String s5 = new String(s4);
//        System.out.println(s5);
//        char []c=new char[s5.length()];
//        System.out.println(ch);
//
//
//        for (int i=0;i<s5.length();i++){
//            c[i]=s5.charAt(i);
//        }
//        int []marks={12,23,53,445,76};
//        System.out.println(c);
//        System.out.println(marks);
//        char []cha = new char[]{'a','h','f','i','b'};
//        System.out.println(cha);


        String str = "@Pawa%]n Kum/ar Meena";

        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9_]", "");
        System.out.println(str);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {

            }
        }
    }
}
