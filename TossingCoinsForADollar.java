package ch6java6thedition;
import java.util.Scanner;
/**
 * This program uses the Coin class to represent a quarter,
 * a nickel, and a dime. When the game begins, the player's
 * balance is $0.00. During each round of the game, the 
 * three coins will have simulated tosses. If a coin lands
 * heads up, the value of that coin will be added to the score. 
 * The game ends when the score reaches or exceeds $1.00. 
 * If the player's balance reaches exactly $1.00, the player
 * wins the game. If it goes over $1.00, they lose. 
 * 
 * @author craig
 */
public class TossingCoinsForADollar {
	public static void main(String [] args) {
		// Variables 
		String  answer = ""; // To pause the game (dramatic effect)
		int     value,  // The coins value
			totalScore = 0;
	
		// Create three instances of the Coin class
		Coin quarter = new Coin();
		Coin dime = new Coin();
		Coin nickel = new Coin();
	
		// Give the coins value
		quarter.setValue(25);
		dime.setValue(10);
		nickel.setValue(5);

		// Talk to the humans and let them knoe what's going on..
		System.out.println("Hi! This is the coin tossing game. I'll"
			+ " flip three coins each round,\na quarter, a dime,"
			+ " and a nickel. If a coin lands face up, its worth\n"
			+ "will be added to your score. If your score hits\n"
			+ "exactly $1.00, you win, if it goes over a dollar\n"
			+ "then you lose. Ready to begin?");

		// Create a Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Pause for answer
		answer = input.nextLine();

		System.out.println("Ok, here goes..");

		// Loop to flip coins
		while(totalScore <= 100) {
			int counter = 1;
			quarter.toss();
			dime.toss();
			nickel.toss();

			// Quarters
			System.out.print("Round " + counter + ":\n"
				+ "Quarter is " + quarter.getSideUp() 
			+ " = ");
			if(quarter.getSideUp().equals("Heads")) {
				System.out.println("25 cents");
				totalScore += 25;
			}
			else {
				System.out.println("0 cents");
			}

			// Dimes
			System.out.print("Dime is " + dime.getSideUp() + "    = ");
			if(dime.getSideUp().equals("Heads")) {
				System.out.println("10 cents");
				totalScore += 10;
			}
			else {
				System.out.println("0 cents");	
			}

			// Nickels
			System.out.print("Nickel is " + nickel.getSideUp() + "  = ");
			if(dime.getSideUp().equals("Heads")) {
				System.out.println("5 cents");
				totalScore += 5;
			}
			else {
				System.out.println("0 cents");
			}
			
			counter++;

			if(totalScore == 100) {
				System.out.println("\nTotal Score = " + totalScore);
				System.out.println("You won!\n");
				break;
			}
			else if(totalScore > 100) {
				System.out.println("\nTotal Score = " + totalScore);
				System.out.println("Sorry, you lost :(\n");
				break;
			} 
		}
	}
}