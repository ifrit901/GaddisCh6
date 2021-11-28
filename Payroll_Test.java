package ch6java6thedition;
import java.util.Scanner;
/**
 * The Payroll_Test is a test for the Payroll class.
 * It creates a Payroll object and asks the user to 
 * enter the data for the employee. Then it calculates
 * the employee's gross pay earned.
 * 
 * @author craig
 */
public class Payroll_Test {
	// Main method
	public static void main(String [] args) {
		// Create a Payroll object
		Payroll p = new Payroll();

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Engage the user and let them know what's going on lol
		System.out.println("This program will calculate"
			+ " the gross hourly pay for an employee.\n"
			+ "Enter the employee's name:");

		p.setName(input.nextLine());

		System.out.println("Enter the employee's ID number:");

		p.setIdNumber(input.nextInt());

		System.out.println("Enter the number of hours the employee "
			+ "worked:");

		p.setNumberOfHoursWorked(input.nextInt());

		System.out.println("Enter the employee's pay rate:");

		p.setPayRate(input.nextDouble());

		// Calculate the gross pay and display it with employee info
		System.out.println(p.toString());
	}
}
