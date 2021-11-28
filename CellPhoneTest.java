package ch6java6thedition;
import java.util.Scanner;
/**
 * To test the CellPhone class.
 * 
 * @author craig
 */
public class CellPhoneTest {
	public static void main (String [] args) {
		// Variables
		String testManufact;         // To hold a manufacturer
		String testModel;            // To hold a model number
		double testRetailPrice;      // To hold a price

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt user for the phone's manufacturer, model, and price
		System.out.println("What is the phone's manufacturer?");
		testManufact = input.nextLine();

		System.out.println("What is the phone's model number?");
		testModel = input.nextLine();

		System.out.println("What is the phone's retail price?");
		testRetailPrice = input.nextDouble();

		// Create an instance of the CellPhone class, passing the 
		// user input as arguments to the constructor
		CellPhone testPhone = new CellPhone(testManufact, testModel,
						    testRetailPrice);

		// Display the data to the user
		System.out.println("\n\nThis is the data you provided:");
		System.out.println("The phone's manufacturer is " + testPhone.getManufact());
		System.out.println("The phone's model number is " + testPhone.getModel());
		System.out.println("The phone's retail price is $" + testPhone.getRetailPrice());
	}
}