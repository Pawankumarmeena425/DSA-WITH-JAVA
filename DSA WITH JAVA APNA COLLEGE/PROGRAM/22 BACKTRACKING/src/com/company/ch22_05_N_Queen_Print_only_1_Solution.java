package com.company;

public class ch22_05_N_Queen_Print_only_1_Solution {
    public static boolean isSafe(char board[][],int row,int col){
//    Check Vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
//    Check for Digional left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
//    Check for diogonal right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueen(char board[][],int row){

//        Base Case
        if(row==board.length){

            return true;
        }


        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueen(board,row+1)) {
//                   Return if this chessboard is possible
//                    It return to main after first solution is find
                    return true;
                }
//                Check for another chessboard
                else{
                    board[row][j]='X';
                }

            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("-------------------CHESSBOARD----------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String[] args) {
        //        Place N queen on N*N ChessBoard , Such that Queen can attack Row Wise  , Column Wise , Digonal Left and Digonal
//        right
//       Print only one solution if exists
        int n=5;
        char board[][]=new char[n][n];
//        Initially set all position with char 'X'
        for (int i =0;i<board.length;i++){
//           board.length --->>> Because row and column are same
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
      if( nQueen(board,0)) {
          System.out.println("Solution is possible::");
          printBoard(board);
      }
else{
          System.out.println("Solution is not possible::");
      }
    }
}
