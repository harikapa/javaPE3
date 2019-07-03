package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    public static ChessBoard chessBoard;

    @BeforeClass
    public static void setUp()
    {
        chessBoard = new ChessBoard();
    }

    @AfterClass
    public static void tearDown()
    {
        chessBoard = null;
    }

    @Test
    public void testForCreateChessBoardSuccess()
    {
        assertArrayEquals(new String[][] {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"}, {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"}, {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"}, {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"}, {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}},
                chessBoard.createChessBoard(8,8));
    }

    @Test
    public void testForCreateChessBoardFailure()
    {
        assertArrayEquals(null,
                chessBoard.createChessBoard(8,9));
    }

    @Test
    public void testForCreateChessBoardFailureWithNegativeInputs()
    {
        assertArrayEquals(null,
                chessBoard.createChessBoard(-8,9));
    }



}