package ch6java6thedition;

/**
 * This program simulates the rolling of two dice.
 * 
 * @author craig
 */
public class Diced {
	public static void main (String [] args) {
		final int DIE1_SIDES = 6;      // Number of sides for die 1
		final int DIE2_SIDES = 12;     // Number of sides for die 2
		final int MAX_ROLLS = 5;       // Number of times to roll

		// Create two instances of the DieRoller class
		DieRoller die1 = new DieRoller(DIE1_SIDES);
		DieRoller die2 = new DieRoller(DIE2_SIDES); 

		// Display the initial state of the dice
		System.out.println("This program will simulate the rolling "
			+ "\nof a " + DIE1_SIDES + " sided die and a "
			+ DIE2_SIDES + " sided die.");

		System.out.println("\nThe initial values on the top face of the "
			+ " dice are:\n" + die1.getValue() + " and " 
			+ die2.getValue());

		// Roll the dice five times
		System.out.println("\nRolling the dice " + MAX_ROLLS 
			+ " times:");

		// Loop for rolls
		for (int i = 1; i <= MAX_ROLLS; i++) {
			die1.roll();
			die2.roll();
			System.out.println("The die values for roll " + i 
			+ " are: " + die1.getValue() + " and " + die2.getValue());
		}
	}	
}
