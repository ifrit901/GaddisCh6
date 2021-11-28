package ch6java6thedition;
import java.util.Scanner;
/**
 * This is the main method for the ChoHan program. 
 * 
 * @author craig
 */
public class Code_Listing6_19 {
	public static void main(String [] args) {
		final int MAX_ROUNDS = 5;    // The number of rounds.
		String player1Name;          // The name of player 1.
		String player2Name;          // The name of player 2.

		// Create a Scanner object for keyboard input
		Scanner input = new Scanner(System.in);

		// Get the player's names 
		System.out.println("What is the first player's name?");
		player1Name = input.nextLine();

		System.out.println("What is the second player's name?");
		player2Name = input.nextLine(); 

		// Create the dealer
		Dealer dealer = new Dealer();

		// Create the players
		Player player1 = new Player(player1Name); 
		Player player2 = new Player(player2Name);

		// Play the rounds
		for(int round = 0; round < MAX_ROUNDS; round++) {
			System.out.println("---------------------------------");
			System.out.printf("Now playing round %d.\n", round + 1);

			// Roll the dice
			dealer.rollDice();

			// The players make their guesses
			player1.makeGuess();
			player2.makeGuess();

			// Determine the winner of the round
			roundResults(dealer, player1, player2);

		}

		// Display the grand winner
		displayGrandWinner(player1, player2);
	}	

	/**
	 * The roundResults method determines who won the round.
	 * @param dealer The Dealer object
	 * @param player1 The Player #1 object
	 * @param player2 The Player #2 object
	 */

	public static void roundResults(Dealer dealer, Player player1, 
					Player player2) {
		// Show the dice values
		System.out.printf("The dealer rolled a %d and a %d\n", 
				  dealer.getDieValue1(), dealer.getDieValue2());
		System.out.printf("Result: %s", dealer.getChoOrHan());

		// Check each player's guess and award points accordingly
		checkGuess(player1, dealer);
		checkGuess(player2, dealer);
	}

	/**
	 * The checkGuess method checks a player's guess against
	 * the dealer's result.
	 * @param player The player object to check.
	 * @param dealer The dealer object.
	 */

	public static void checkGuess(Player player, Dealer dealer) {
		final int POINTS_TO_ADD = 1;        // Points to award winner
		String guess = player.getGuess();   // The player's guess
		String choHanResult = dealer.getChoOrHan(); // Cho or Han

		// Display the player's guess
		System.out.printf("The player %s guessed %s.\n", 
			player.getName(), player.getGuess());

		// Award points if necessary
		if (guess.equalsIgnoreCase(choHanResult)) {
			player.addPoints(POINTS_TO_ADD);
			System.out.printf("Awarding %d points to %s.\n",
				POINTS_TO_ADD, player.getName());
		}
	}
	/**
	 * The displayGrandWinner method display's the game's grand winner.
	 * @param player1 Player #1.
	 * @param player2 Player #2.
	 */

	public static void displayGrandWinner(Player player1, Player player2) {
		System.out.println("------------------------------------");
		System.out.println("Game Over! Here are the results:");
		System.out.printf("%s: %d\n", player1.getName(), 
			player1.getPoints());
		System.out.printf("%s: %d\n", player2.getName(),
			player2.getPoints());

		if(player1.getPoints() > player2.getPoints()) {
			System.out.println(player1.getName() + 
				" is the Grand Winner!!");
		}
		else if(player1.getPoints() < player2.getPoints()) {
			System.out.println(player2.getName() + 
				" is the Grand Winner!!");
		}
		else
			System.out.println("It's a tie!!");
	}
}
