package com.company;

public class Question_10_MoveZeros {
    public static void moveZero(int arr[]) {
//        1st Approch
//        int v = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                for (int j = i+1; j < arr.length ; j++) {
//                    if (arr[j]!=0){
//                        arr[i]=arr[j];
//                        arr[j]=0;
//                        break;
//                    }
//                }
//            }
//
//        }

//        2nd Approch
        int i=0;
        for (int j=0;j<arr.length;j++){

          if(arr[j]!=0){
                arr[i]=arr[j];
                arr[j]=0;
                i++;
            }
        }
    }
        public static void main (String[]args){
            int arr[] = {0,1,4, 0, 3, 2, 0, 0, 4, 0,0,0,0,0,0,5};
            moveZero(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }