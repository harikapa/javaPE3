package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindFirstAndLastDayOfWeekTest {

    public static FindFirstAndLastDayOfWeek findFirstAndLastDayOfWeek;

    @BeforeClass
    public static void setUp()
    {
        findFirstAndLastDayOfWeek = new FindFirstAndLastDayOfWeek();
    }

    @AfterClass
    public static void tearDown()
    {
        findFirstAndLastDayOfWeek = null;
    }

    @Test
    public void testForFindingFirstAndLastDayOfWeek()
    {
        FindFirstAndLastDayOfWeek.Result result = findFirstAndLastDayOfWeek.getFirstAndLastdayOfWeek();
        assertEquals("Mon 24/06/2019",result.firstDay);
        assertEquals("Sun 30/06/2019",result.lastDay);
    }


}