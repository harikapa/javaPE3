package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionHandlingDemoTest {

    public static ExceptionHandlingDemo exceptionHandlingDemo;

    @BeforeClass
    public static void setUp()
    {
        exceptionHandlingDemo = new ExceptionHandlingDemo();
    }

    @AfterClass
    public static void tearDown()
    {
        exceptionHandlingDemo = null;
    }

    @Test
    public void testForExceptionHandlingSuccess()
    {
        assertEquals("finally block", exceptionHandlingDemo.throwException(2));

        assertEquals("finally block", exceptionHandlingDemo.throwException(13));

        assertEquals("finally block", exceptionHandlingDemo.throwException(10));
    }
}