package com.stackroute.pe3;

//Write a java program to calculate first and last date of a week.

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FindFirstAndLastDayOfWeek {

    public FindFirstAndLastDayOfWeek()
    {

    }

    public class Result{
        String firstDay;
        String lastDay;
    }

    public Result getFirstAndLastdayOfWeek()
    {
        Calendar c = Calendar.getInstance();

        Result result = new Result();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");

        result.firstDay = df.format(c.getTime());

        c.add(Calendar.DATE, 6);

        result.lastDay = df.format(c.getTime());

        return result;
    }

}
