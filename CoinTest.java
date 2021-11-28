package ch6java6thedition;

/**
 * This program is designed to test the Coin class.
 * It creates an instance of the Coin class and 
 * displays the initial state of the coin, heads 
 * or tails. Then the coin is tossed 20 times and 
 * the results are displayed. The number of heads 
 * and tails are tallied and displayed also. 
 * 
 * @author craig
 */
public class CoinTest {
	
	// Main method 
	public static void main(String [] args) {
		// Variables 
		int     heads = 0,
			tails = 0;

		// Create a Coin object
		Coin coin = new Coin();

		// Display initial state of the coin
		System.out.println("The initial up side of the coin is " + coin.getSideUp());

		// Loop 20 times and collect the results
		for(int i = 1; i <= 20; i++) {
			coin.toss(); // Flip the coin
			
			System.out.println("On flip " + i + " the face is " 
			+ coin.getSideUp()); // Display the coin face 

			// Increment the heads or tails count
			if(coin.getSideUp().equals("Heads")) {
				heads++;
			}
			else {
				tails++;
			}
		}

		// Display heads and tails count
		System.out.println("The number of Heads was: " + heads);
		System.out.println("The number of Tails was: " + tails);
	}
}
