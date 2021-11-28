package ch6java6thedition;
import java.util.Scanner;
/**
 * This program creates an instance of the DieRoller 
 * class. It creates two DieRoller objects, one for
 * the computer and one for the player. A loop goes 
 * through 10 iterations simulating 10 dice rolling
 * games between the computer and player. Their 
 * scores are recorded and calculated. The winner
 * is displayed at the end.
 * 
 * @author craig
 */
public class DiceGame {
	// Main method
	public static void main(String [] args) {
		// Variables
		int   playerScore = 0,
		    computerScore = 0;

		String answer = ""; 

		// Create two instances of the DieRoller class
		DieRoller player = new DieRoller(6);
		DieRoller computer = new DieRoller(6);

		// Engage the user and let them know what's going on
		System.out.println("This is a dice game between you and me "
			+ "(the computer)\nWe will roll the dice 10 times and "
			+ "the highest score wins that round. "
			+ "\nWhoever has the highest score"
			+ " wins!"); 

		Scanner input = new Scanner(System.in);

		System.out.println("Ready to play?");
		answer = input.nextLine();
		
		// Loop 10 times with some output
		for(int i = 1; i <= 10; i++) {
			player.roll();
			int pScore = player.getValue();

			computer.roll();
			int cScore = computer.getValue();

			// Display the roll results
			System.out.println("Player roll = " + pScore);
			System.out.println("Computer roll = " + cScore);

			// Compare scores and list winner for this round
			if(pScore > cScore) {
				System.out.println("You win this round! "
					+ "Player points +1");
				playerScore++;
			}
			else if(cScore > pScore) {
				System.out.println("I won this round! "
					+ "Computer points +1");
				computerScore++;
			}
			else {
				System.out.println("This one was a tie, no "
					+ "points awarded.");
			}
			System.out.println("\n\n");
		}

		// Tally the points and declare a winner
		if(playerScore > computerScore) {
			System.out.println("You got " + playerScore + " points..\n"
				+ "I got " + computerScore + " points.."
				+ "\nYOU WON!!!");
		}
		else if(computerScore > playerScore) {
			System.out.println("You got " + playerScore + " points..\n"
				+ "I got " + computerScore + " points.."
				+ "\nSorry, you lost :(");
		}
		else {
			System.out.println("You got " + playerScore 
			+ "\nI got " + computerScore  
			+ "\nIt's a tie! Darn! I thought I was gonna beat you :(");
		}
	}
}
