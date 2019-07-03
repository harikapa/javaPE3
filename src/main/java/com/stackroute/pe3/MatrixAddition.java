package com.stackroute.pe3;

//Write a program to compute the addition of two matrix, Read the number of rows and columns
//as input, also the values of each matrix

public class MatrixAddition {

    public MatrixAddition()
    {

    }

    public int[][] addTwoMatrices(int row, int column, int[][] matrix1, int[][] matrix2)
    {
        try {

            int[][] result = new int[row][column];

            for (int i = 0; i < row; i++) {   //adding two matrices
                for (int j = 0; j < column; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            return result;
        }
        catch (Exception exception)
        {
            return null;
        }
    }
}
