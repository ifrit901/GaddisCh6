package ch6java6thedition;
import java.util.Scanner;
/**
 * This is a use of the DieRoller class from earlier in 
 * the chapter.
 * 
 * @author craig
 */
public class Player21 {
	// Main method
	public static void main (String [] args) {
		
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Talk to the user
		System.out.println("Time to play 21!\n\n"
			+ "This game is like Blackjack only with two dice. \n"
			+ "The total from both dice is your score for a roll.\n"
			+ "I'll roll for us both to start the game and \n"
			+ "you choose if you want us to roll again. The \n"
			+ "object is to get the highest score without \n"
			+ "going over 21. I'll start the first roll.\n\n");

		// Create four die
		DieRoller die1 = new DieRoller(6);
		DieRoller die2 = new DieRoller(6);
		DieRoller die3 = new DieRoller(6);
		DieRoller die4 = new DieRoller(6);

		
		String answer;
		char again = 'y';
		int playerScore = 0;
		int computerScore = 0;
		int count = 1;

		while(again == 'y' || again == 'Y') {
			// Variable to count the loops
			if(count > 4) {
				System.out.println
				("Wow! This is getting tense!");
			}
			// Roll the dice for both players	
			die1.roll(); die2.roll(); die3.roll(); die4.roll();

			// Combine the totals with previous scores
			playerScore += die1.getValue() + die2.getValue();
			computerScore += die3.getValue() + die4.getValue();

			System.out.println("Roll number " + count + ":\n"
				+ "Your score: " + playerScore + "\n");

			if(playerScore > 21 || computerScore > 21) 
				break;

			count++;
			System.out.println("Wanna roll again? Y or N");
			answer = input.nextLine();
			again = answer.charAt(0);
		}
		// Totals are presented and winner is declared
		if(computerScore > playerScore && computerScore <= 21) { 
		System.out.println("My score: " + computerScore
				+ "\nYour score: " + playerScore
				+ "\nYou lost!");
		}
		else if(playerScore > computerScore && playerScore <= 21)
			System.out.println("My score: " + computerScore
				+ "\nYour score: " + playerScore
				+ "\nYou won!");
		else if(computerScore > 21) {
			System.out.println("My score: " + computerScore 
				+ "\nYour score: " + playerScore);
			System.out.println("I broke 21, you won!");
		}
	        else if(playerScore > 21) {
			System.out.println("My score: " + computerScore 
			+ "\nYour score: " + playerScore);
			System.out.println("You broke 21, I won!");
		}
		else
			System.out.println("Error");


		System.exit(0);
	}
}
