package com.stackroute.pe3;

//Create a class with a main( ) that throws an object of class Exception inside a try block.

public class ExceptionHandlingDemo {

    public ExceptionHandlingDemo()
    {

    }

    public String throwException(int number)
    {
        try{

            String message = "Exception thrown by throwException method : number should not be less than 10";

            if(number < 10)
            {
                throw new Exception(message);  //Exception Object with custom message
            }

            System.out.println("message from method");

            return message;

        }catch (Exception exception)
        {
            System.out.println(exception.getMessage());

        }
        finally {

            System.out.println("finally block");

            return "finally block";
        }
    }
}
