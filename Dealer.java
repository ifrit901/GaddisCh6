package ch6java6thedition;
/**
 * This is the Dealer class.
 * 
 * 		------------------------------
 * 		|	    Dealer           |
 * 		|----------------------------|
 * 		| - dieValue1 : int          |
 * 		| - dieValue2 : int 	     |
 * 		|----------------------------|
 * 		| + Dealer()		     | 
 * 		| + rollDice() : void        | 
 * 		| + getChoOrHan() : String   |
 * 		| + getDieValue1() : int     |
 * 		| + getDieValue2() : int     |
 * 		------------------------------
 * 
 * @author craig
 */
public class Dealer {
	// Variables
	int dieValue1;
	int dieValue2;

	// This is the constructor
	public Dealer() {
		dieValue1 = 0;
		dieValue2 = 0;
	}

	/**
	 * The rollDice method simulates rolling the dice.
	 */
	public void rollDice() {
		final int SIDES = 6;

		// Create two dice. (This also rolls them)
		DieRoller die1 = new DieRoller(SIDES);
		DieRoller die2 = new DieRoller(SIDES);

		// Record their values
		dieValue1 = die1.getValue();
		dieValue2 = die2.getValue();
	}
	
	/**
	 * The getChoOrHan method determines if the die roll was even or odd 
	 * and returns the appropriate string.
	 * @return The String even or odd
	 */
	public String getChoOrHan() {
		String result;   // To hold even or odd

		// Get the sum of the die values
		int sum = dieValue1 + dieValue2;

		// Determine if sum is even or odd
		if (sum % 2 == 0) 
			result = "Cho (even)";
		else
			result = "Han (odd)";

		// Return the result
		return result;
	}
	/**
	 * The getDievalue1 method returns the value of die1..
	 * @return The value of the die.
	 */
	public int getDieValue1() {
		return dieValue1;
	}
	/**
	 * The getDie2Value method returns the value of the second die.
	 * @return The value of the die.
	 */
	public int getDieValue2() {
		return dieValue2;
	}
}
