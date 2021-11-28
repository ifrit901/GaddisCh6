package ch6java6thedition;
import java.util.Scanner;
/**
 * This is a class corresponding to programming challenge
 * number 15. It tests the RouletteWheel class.
 * 
 * @author craig
 */
public class RouletteWheelColors {
	// Main method
	public static void main(String [] args) {
		// Variable
		int pocketNumber;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Talk to the user and let them know what's going on
		System.out.println("Hello! This is the Roulette Wheel class"
			+ "demonstration method :)\nEnter a pocket number "
			+ "0 - 36 and I'll tell you if it's green, "
			+ "red or Black.\nEnter a number:");

		pocketNumber = input.nextInt();

		// Create a RouletteWheel object and pass it 
		// the use input
		RouletteWheel wheel = new RouletteWheel(pocketNumber);

		//Display the results
		System.out.println("The pocket color for number " + pocketNumber 
		+ " is " + wheel.getColor(pocketNumber));
	}
}
