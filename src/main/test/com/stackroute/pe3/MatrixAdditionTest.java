package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    public static MatrixAddition matrixAddition;

    @BeforeClass
    public static void setUp()
    {
        matrixAddition = new MatrixAddition();
    }

    @AfterClass
    public static void tearDown()
    {
        matrixAddition = null;
    }

    @Test
    public void testForMatrixAdditionSuccess()
    {
        int[][] result = matrixAddition.addTwoMatrices(3,2, new int[][] {{1,2},{3,4},{5,6}}, new int[][] {{1,2},{3,4},{5,6}} );
        assertArrayEquals(new int[][] {{2,4},{6,8},{10,12}},result);

        assertArrayEquals(new int[][] {{0,4},{0,8},{10,0}},
                matrixAddition.addTwoMatrices(3,2, new int[][] {{1,2},{3,4},{5,6}}, new int[][] {{-1,2},{-3,4},{5,-6}} ));

        assertArrayEquals(new int[][] {{99999,-4},{-33,8},{10,0}},
                matrixAddition.addTwoMatrices(3,2, new int[][] {{100000,-2},{-30,4},{5,6}}, new int[][] {{-1,-2},{-3,4},{5,-6}} ));
    }


    @Test
    public void testForMatrixAdditionFailure()
    {
        assertArrayEquals(null,
                matrixAddition.addTwoMatrices(3,3, new int[][] {{1,2},{3,4},{5,6}}, new int[][] {{-1,2},{-3,4},{5,-6}} ));

        assertArrayEquals(null,
                matrixAddition.addTwoMatrices(3,2, new int[][] {{100000,-2},{-30,4},{5,6}}, new int[][] {{-1,-2},{-3,4},{5}}));
    }

}