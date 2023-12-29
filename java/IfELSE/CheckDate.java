package IfELSE;

import java.util.Scanner;

public class CheckDate {
	public static void main(String[] args) {

   Scanner sc=new Scanner(System.in);
   int month , day ,year;
   int dayInMonth;
   boolean month1 , day1 , year1;
   boolean validDate;
   boolean leapYear;
   
   if (month <1 || month >12)
   { month1 = true;}
if (year <0 || year >4000)
   {year1= true;}

//I'm using a switch here instead of an if-else statement, which can also be used


    int numDays;
	switch (month) {
       case 1:
       case 3:
       case 5:             //months with 31 days
       case 7:
       case 8:
       case 10:
       case 12:
            numDays = 31;
            break;
        case 4:
        case 6:              //months with 30 days
        case 9:
        case 11:
            numDays = 30;
            break;

        case 2:
            if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))  //formula for leapyear
                numDays = 29;
                   {
                       System.out.println("is a leap year");
                       }
                   else {
            	numDays = 28;
                {
                    System.out.println("is not a leap year");
                    }

			}
                            break;
       default:
            System.out.println("Invalid month.");
       break;

            if (month1 == true)
            if (day1 == true)
            if (year1 == true)
                  System.out.println ("date is valid ");

            else
            if (month1 == false)
                  System.out.println ("date is invalid");

            else
            if (day1 == false)
                  System.out.println ("date is invalid");

             else
             if (year1 == false)
                  System.out.println ("date is invalid");



}}

}
