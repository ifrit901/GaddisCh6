package ch6java6thedition;
import java.util.Scanner;
/**
 * This program is to test the DaysInAMonth class. 
 * 
 * @author craig
 */
public class DaysInAMonthTest {
	public static void main (String [] args) {
	// Create a Scanner object
	Scanner input = new Scanner(System.in);

	// Talk to the user and let them know whats going on
	System.out.println("Enter the number for a month (1 = Jan, 2 = Feb, etc.)"
		+ "\nand a year and  I'll tell you how many days \nare in that "
		+ "month for that year.\nEnter the month:");

	// Catch the user input in some variables
	int month = input.nextInt();

	System.out.println("Enter a year");
	int year = input.nextInt();

	// Create a DaysInAMonth object
	DaysInAMonth monthNumbers = new DaysInAMonth(month, year);

	// Display the results
	System.out.println("The number of days int month " + month + " of year "
		+ year + " is " + monthNumbers.getNumberOfDays(month, year));	

	}
}
