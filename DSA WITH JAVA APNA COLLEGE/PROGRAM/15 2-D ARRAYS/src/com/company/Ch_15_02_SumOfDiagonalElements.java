package com.company;

public class Ch_15_02_SumOfDiagonalElements {
    public static void sumOfDiognal(int arr[][]){
      int fsum=0,bsum=0;
//        for (int i=0;i<arr.length;i++ ){
//            for (int j=0;j<arr[0].length;j++){
//                if(i==j){
//                    fsum = fsum+arr[i][j];
//                }
//                if( (i+j==arr.length-1)&&i!=j){
//                    bsum = bsum+arr[i][j];
//                }
//            }
//        }

        for (int i=0;i<arr.length;i++){
//            Sum of primary Diogonal
            fsum = fsum+arr[i][i];
//            Sum of Secondary Diogonal
//            i+j==length-1    --->> j = length-1-i
            if (i!= arr.length-1-i){
                bsum = bsum+arr[i][arr.length-1-i];
            }
        }
        int sum = fsum+bsum;
        System.out.println("Sum of Diogional elements = "+sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},
                     {5,6,7,8,9},
                     {0,9,8,7,6},
                     {5,4,3,2,1},
                     {1,2,3,4,5}};
        sumOfDiognal(arr);
    }
}
