package ch6java6thedition;

/**
 * This is the class for programming challenge #9.
 * 
 * @author craig
 */
public class DaysInAMonth {
	private int month;
	private int year;

	public DaysInAMonth(int month, int year) {
		this.month = month;
		this.year = year;
	}

	/**
	 * The setMonth method accepts an integer value 
	 * which represents the month of the year.
	 * @param month The month of the year.
	 */
	public void setMonth(int month) {
		this.month = month;	
	}

	/**
	 * The setYear method accepts an integer value
	 * which is the year.
	 * @param year The year.
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * The getMonth method returns the integer month
	 * of the year. 
	 * @return month.
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * The getYear method returns the integer which
	 * is the year.
	 * @return year.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * The getNumberOfDays method calculates the number
	 * of days in a specified month. It accepts an 
	 * integer argument that corresponds to the month 
	 * of the year and returns the number of days in 
	 * that month.
	 * @param year The year.
	 * @param month The number corresponding to the month.
	 * @return The number of days in the month.
	 */
	public int getNumberOfDays(int month, int year) {
		int numberOfDays = 0;
		
		if(year % 100 == 0 && year % 400 == 0) {
			if(month == 2) 
				numberOfDays = 29;
		}
		if(month == 1 || month == 3 || month == 5 || month == 7
			|| month == 8 || month == 10 || month == 12) {
			numberOfDays = 31;
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			numberOfDays = 30;
		}		
		else
			System.out.println("Invalid month and/or year.");
		return numberOfDays;
	}
}
