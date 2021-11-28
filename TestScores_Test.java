package ch6java6thedition;
import java.util.Scanner;
/**
 * This tests the TestScores class. 
 * 
 * @author craig
 */
public class TestScores_Test {
	// Main method
	public static void main(String [] args) {
		
		// Create an object of the TestScores class
		TestScores t = new TestScores();

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Aknowledge the user and let them know what's going on
		System.out.println("Enter three scores and I'll calculate"
			+ " the average.\nEnter the first score: ");

		t.setScore1(input.nextInt());

		System.out.println("Enter the second score: ");

		t.setScore2(input.nextInt());

		System.out.println("Enter the third score: ");

		t.setScore3(input.nextInt());

		System.out.println("Thanks! I'll now calculate their average.\n"
			+ "Press ENTER to continue.");

		input.nextLine();
		input.nextLine();


		int 	score1 = t.getScore1(),
			score2 = t.getScore2(),
			score3 = t.getScore3();
		
		// Calculate the average and display it on the screen

		System.out.println("The average test score is " 
		+ t.calculateAverage(score1, score2, score3));
	} 
}
