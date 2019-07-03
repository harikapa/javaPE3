package com.stackroute.pe3;

//Write a program to create a ChessBoard pattern with the help of multidimensional array, where
//WWrepresents white color and BB represents Black color.

public class ChessBoard {
    public ChessBoard()
    {

    }

    public String[][] createChessBoard(int rows, int columns)
    {
        if( rows !=8 || columns != 8)
        {
            return null;
        }

        String chessBoard[][] = new String[rows][columns];

        for(int i=0; i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if((i+j)%2 ==0)  //logic of white columns of chessboard
                {
                    chessBoard[i][j] = "WW|";
                }
                else
                {
                    chessBoard[i][j] = "BB|";
                }
            }
        }

        return chessBoard;
    }
}
