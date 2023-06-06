package com.company;

public class ch22_05_N_Queen {
    public static void nQueen(char board[][],int row){

//        Base Case
        if(row==board.length){
            printBoard(board);
            return ;
        }


        for(int j=0;j<board.length;j++){
//            Starting in the first chessboard set queen on 1 column,and then set queen on rows in remaining rows
//            After in the Strating for 2nd Chessboard set queen on 2 coulumn , and then set queen on remaining rwos
            board[row][j]='Q';
            nQueen(board,row+1);
//            Clear Queen after one chessboard print
            board[row][j]='X';
        }
    }

    public static void printBoard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        Place N queen on N*N ChessBoard , Such that Queen can attack Row Wise  , Column Wise , Digonal Left and Digonal
//        right
//        Question : 1 Without take care of atteck place queen on ChessBord\
        int n=2;
        char board[][]=new char[n][n];
//        Initially set all position with char 'X'
        for (int i =0;i<board.length;i++){
//           board.length --->>> Because row and column are same
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        nQueen(board,0);
    }
}
