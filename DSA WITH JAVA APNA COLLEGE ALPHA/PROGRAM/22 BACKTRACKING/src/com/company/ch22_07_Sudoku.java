package com.company;

public class ch22_07_Sudoku {
    public static boolean sudoku_Solver(int sudoku[][],int row,int col){
//Base Case
        if(row==9){
    return true;
}
//        Recursion
        int nexrow = row;
        int nextcol = col+1;
//        When reachout at the end of the column , Move to the next row
        if(col+1==9){
            nexrow = row+1;
            nextcol = 0;
        }
        if(sudoku[row][col]!=0){
            return sudoku_Solver(sudoku,nexrow,nextcol);
        }
//When all 9th digit is not possible to place then return false
            for (int digit = 1; digit <= 9; digit++) {
                if (isSafe(sudoku, digit, row, col)) {
                    sudoku[row][col] = digit;
//    Recursion Step
                    if (sudoku_Solver(sudoku, nexrow, nexrow)) {
                        return true;
                    }
                        sudoku[row][col] = 0;
                    //    Backtracking Steps

                }
            }

   return false;
    }
    public static boolean isSafe(int sudoku[][],int digit,int row,int col){
//        Check in the row
        for(int j=0;j<sudoku.length;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
//        Check in the column
        for(int i=0;i<sudoku.length;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
//        Check in the grid
       int sr = (row/3)*3;
        int sc = (col/3)*3;
        int er = sr+3;
        int ec = sc+3;
        for(int i=sr;i<er;i++){
            for(int j=sc;j<ec;j++){
                if (sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printSudoku(int sudoku[][]){
        for (int i=0;i<sudoku.length;i++){
            for (int j=0;j<sudoku.length;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
        if(sudoku_Solver(sudoku,0,0)){
            System.out.println("Sudoku Solution is possible:/n And solution is :::");
            printSudoku(sudoku);
        }
        else {
            System.out.println("Solution doesn't Exists:::");
        }
    }
}
