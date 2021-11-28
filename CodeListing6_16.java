package ch6java6thedition;

/**
 * This is code listing 6.16. 
 * It demonstrates sending an object as an argument.
 * 
 * @author craig
 */
public class CodeListing6_16 {
	// This program rolls a 6 sided die and a 20 sided die.
	public static void main (String [] args) {
		final int SIX_SIDES = 6;
		final int TWENTY_SIDES = 20;

		// Create two instances of the Die class 
		DieRoller sixDie = new DieRoller(SIX_SIDES);
		DieRoller twentyDie = new DieRoller(TWENTY_SIDES);

		// Call method rollDie passing the object reference variables
		// as arguments
		rollDie(sixDie);
		rollDie(twentyDie);
	}
	/**
	 * The rollDie method rolls a die object passed to it and
	 * prints the number of sides and value.
	 * @param die The reference variable of the die object.
	 */
	public static void rollDie(DieRoller d) {
		// Display the number of sides
		System.out.println("Rolling a " + d.getSides() + 
			" sided die.");

		// Roll the die
		System.out.println("The die's value is " + d.getValue() + "\n");
	}
}
