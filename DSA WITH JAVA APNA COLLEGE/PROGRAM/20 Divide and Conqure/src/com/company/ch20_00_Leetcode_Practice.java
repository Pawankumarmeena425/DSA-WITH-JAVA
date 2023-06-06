package com.company;
import java.util.*;
public class ch20_00_Leetcode_Practice {
    public static int matrixScore(int[][] grid) {
        while(true){
            int maxrow=0;
            int maxcol=0;
            int maxrowval=0;
            int maxcolval=0;
            // Maximum row
            for(int i=0;i<grid.length;i++){
                int count=0;
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==0){
                        count++;
                    }
                }
                if(count>maxrowval){
                    maxrow = i;
                    maxrowval  =count;
                }
            }
            // Maximum column
            for(int k=0;k<grid[0].length;k++){
                int count=0;
                for(int l=0;l<grid.length;l++){
                    if(grid[l][k]==0){
                        count++;
                    }
                }
                if(count>maxcolval){
                    maxcol = k;
                    maxcolval = count;
                }
            }

            if(maxcolval<=1){
                break;
            }
// Change row
            if(maxrowval>=maxcolval){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[maxrow][j]==0){
                        grid[maxrow][j]=1;
                    }
                    else{
                        grid[maxrow][j]=0;
                    }
                }
            }
            else{
                for(int k=0;k<grid.length;k++){
                    if(grid[k][maxcol]==0){
                        grid[k][maxcol]=1;
                    }
                    else{
                        grid[k][maxcol]=0;
                    }
                }
            }

        }

        int result=0;
// Compute result
        for(int i=0;i<grid.length;i++){
            int power=0;
            for(int j = grid[0].length-1;j>=0;j--){
                if(grid[i][j]==1){
                    result = result+ (int)Math.pow(2,power);
                }

                power++;
            }
        }


        return result;
    }
    public static void main(String[] args) {
int grid[] []= {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        System.out.println(matrixScore(grid));
    }
}
