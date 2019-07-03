package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleCatchDemoTest {

    public static MultipleCatchDemo multipleCatchDemo;

    @BeforeClass
    public static void setUp()
    {
        multipleCatchDemo = new MultipleCatchDemo();
    }

    @AfterClass
    public static void tearDown()
    {
        multipleCatchDemo = null;
    }

    @Test
    public void testForMultipleCatchSuccess()
    {
        assertEquals("Null pointer Exception", multipleCatchDemo.handlingMultipleCatch(null));

        assertEquals("Index out of bound exception", multipleCatchDemo.handlingMultipleCatch("H@rika"));

        assertEquals("Negative Array Size Exception", multipleCatchDemo.handlingMultipleCatch("demo"));

        assertEquals(null, multipleCatchDemo.handlingMultipleCatch("stackroute"));

    }

    @Test
    public void testForMultipleCatchFailure()
    {
        assertEquals(null, multipleCatchDemo.handlingMultipleCatch("stackroute"));

    }

}