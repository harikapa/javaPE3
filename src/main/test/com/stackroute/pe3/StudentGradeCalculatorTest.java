package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeCalculatorTest {

    public static StudentGradeCalculator studentGradeCalulator;

    @BeforeClass
    public static void setUp()
    {
        studentGradeCalulator = new StudentGradeCalculator();
    }

    @AfterClass
    public static void tearDown()
    {
        studentGradeCalulator = null;
    }

    @Test
    public void testForGradeCalculatorSuccess()
    {
        int[] grades = {80,70,60,78};
        StudentGradeCalculator.Result result = studentGradeCalulator.calculateGrades(4,grades);
        assertEquals(72,result.average,00);
        assertEquals(60,result.minimun);
        assertEquals(80,result.maximum);
    }

    @Test
    public void testForGradeCalculatorFailureWithInvalidInput()
    {
        int[] grades = {80,70,60,78, 465767};
        StudentGradeCalculator.Result result = studentGradeCalulator.calculateGrades(4,grades);
        assertEquals(null,result);
    }

    @Test
    public void testForGradeCalculatorFailureWithOutOfRangeInput()
    {
        int[] grades = {80,70,60,78,178};
        StudentGradeCalculator.Result result = studentGradeCalulator.calculateGrades(4,grades);
        assertEquals(null,result);
    }

}