package com.company;

public class Ch_15_01_SpiralMetrix {
    public static void spiralMetrix(int metrix[][]){
        int sr=0,er = metrix.length-1,sc=0,ec = metrix[0].length-1;

        while(sr<=er&&sc<=ec){
//            Top Row
            for (int i=sc;i<=ec;i++){
                System.out.print(metrix[sr][i]+" ");
            }
//Right Clumn
            for (int i=sr+1;i<=er;i++){
                System.out.print(metrix[i][ec]+" ");
            }
//Bottom row
            for (int i = ec-1;i>=sc;i--){
                System.out.print(metrix[er][i]+" ");
            }
//            Left Columnn
            for (int i=er-1;i>=sr+1;i--){
                System.out.print(metrix[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }


    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},
                     {5,6,7,8,9},
                      {0,9,8,7,6},
                      {5,4,3,2,1},
                      {1,2,3,4,5}};
        spiralMetrix(arr);

        }
    }

