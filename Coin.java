package ch6java6thedition;
import java.util.Random;
/**
 * This is the Coin class from programming 
 * challenge number 16. The Coin class 
 * simulates the tossing of a coin. 
 * 
 * @author craig
 */
public class Coin {
	// Class fields
	private String sideUp;
	private int value;

	// Constructor
	public Coin() {
		value = 0;
		toss();	
	}
	// Methods

	/**
	 * The method toss creates a random number and
	 * sets the field sideUp equal to heads or tails
	 * depending on the random result.
	 * @return Whether the coin is heads or tails.
	 */
	public void toss() {
		// Variable to contain random result
		int flip;

		// Create a Random object
		Random randy = new Random();

		flip = randy.nextInt(2) + 1;

		if(flip == 1) {
			sideUp = "Heads";
		}
		else
			sideUp = "Tails";
	}

	/**
	 * The getSideUp method returns the value 
	 * in the sideUp field.
	 * @return The value in sideUp.
	 */
	public String getSideUp() {
		return sideUp;
	}

	/**
	 * The setValue method accepts an integer
	 * argument and sets the value field 
	 * equal to it. 
	 * @param val The value of the coin.
	 */
	public void setValue(int val) {
		value = val;
	}

	/**
	 * The getValue method exists because I want 
	 * to get the coin value in TossingCoinsForADollar.
	 * @return value.
	 */
	public int getValue() {
		return value;
	}
}
