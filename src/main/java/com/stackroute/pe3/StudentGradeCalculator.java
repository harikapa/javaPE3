package com.stackroute.pe3;

//Create a class called StudentMarks, which prompts user for the number of students, reads it
//from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//grades of each of the students and saves them in an int array called stuGrades. Your program shall
//check that the grade is between 0 and 100 else has to trow an error message.

import java.util.Arrays;

public class StudentGradeCalculator {

    public class Result {
        float average;
        int minimun;
        int maximum;
    }

    public StudentGradeCalculator()
    {

    }

    public Result calculateGrades(int number, int[] grades)
    {
        Result result = new Result();

        if(number != grades.length)
        {
            return null;
        }
        for (int grade : grades) {
            if (grade < 0 || grade > 100) {
                return null;
            }
        }

        result.average = Arrays.stream(grades).sum()/grades.length;
        Arrays.sort(grades);
        result.minimun = grades[0];
        result.maximum = grades[grades.length -1];

        return result;
    }
}
