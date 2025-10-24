package com.example;

import java.time.*;

public class DateTimeFunctions {

	/*
	 * Update the class and existing methods as necessary to perform the required calculations
	 * and return the expected results.
	 *
	 * - All code should be inside the placeholders provided.
	 * - Do not add code outside of the placeholders.
	 * - Do not change code except as required inside the placeholders.
	 *	    //YOUR CODE STARTS HERE
	 *
	 *		//YOUR CODE ENDS HERE
	 */


	/*
	 * Implement the method so that it returns today's date.
	 */
	public static LocalDate getTodaysDate() {

        //uses inbuilt method from LocalDate lib
		return LocalDate.now();


	}

	/*
	 * Implement the method so that it returns the date x days after
	 * the input date.
	 */
	public static LocalDate getLaterDatebyDays(LocalDate date, int x) {

        //making sure date and the number of days are valid
        if(date == null){
            throw new IllegalArgumentException("date cannot be null");
        }

        if (x < 0) {
            throw new IllegalArgumentException("x cannot be negative");
        }

        //uses inbuilt method from LocalDate lib
        return date.plusDays(x);




	}

	/*
	 * Implement the method so that it returns the date x weeks prior to
	 * the input date.
	 */
	public static LocalDate getPreviousDatebyWeeks(LocalDate date, int x) {

        //making sure date and the number of weeks are valid
		if(date == null){
            throw new IllegalArgumentException("date cannot be null");
        }

        if (x < 0) {
            throw new IllegalArgumentException("x cannot be negative");
        }

        //uses inbuilt method from LocalDate lib
        return date.minusWeeks(x);

	}

	/*
	 * Implement the method so that it returns the time difference between two input dates
	 * in terms of years, months, and days.
	 * Return the String in the format: "Year-20:Months-5:Days-1"
	 */
	public static String getTimeDifference(LocalDate date1, LocalDate date2) {

        //making sure both the dates are not null
		if(date1 == null || date2 == null){
            throw new IllegalArgumentException("Input dates cannot be null");

        }

        Period p =  Period.between(date1, date2);

        //uses inbuilt method from period lib
        int years =  p.getYears();
        int months =  p.getMonths();
        int days =  p.getDays();

        String difference = "Years-"+years+":Months-"+months+":Days-"+days;
        return difference;


	}

	public static void main(String[] args) {
		System.out.println("Today's date is: " + getTodaysDate());
		System.out.println("14 days from today is: " + getLaterDatebyDays(getTodaysDate(), 14));
		System.out.println("5 weeks prior to today was: " + getPreviousDatebyWeeks(getTodaysDate(), 5));
		System.out.println("The difference between today " +
				"and June 30, 2031 is: " +
				getTimeDifference(getTodaysDate(), LocalDate.of(2031,06,30)));
	}
}
