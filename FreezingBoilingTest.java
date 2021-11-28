package ch6java6thedition;
import java.util.Scanner;
/**
 * This program tests the FreezingBoiling class from 
 * programming challenge 11. 
 * 
 * @author craig
 */
public class FreezingBoilingTest {
	public static void main(String [] args) {
		int temperature;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Create a FreezingBoiling object
		FreezingBoiling fb = new FreezingBoiling();

		// Talk to the user and let them know what's going on..
		System.out.println("Hello! Tell me a temperature and I'll list\n"
			+ "whether three substances boil or freeze\n"
			+ "at that point.\n\nEnter a temperature:");

		temperature = input.nextInt();

		// Send an argument to the FreezingBoiling constructor
		fb.setTemp(temperature);

		// Display the results
		System.out.println("Substance\tFreezing\tBoiling");
		System.out.println("----------------------------------");
		System.out.println("Ethyl Alcohol\t" + fb.isEthylFreezing()
		+ "\t\t" + fb.isEthylBoiling());
		System.out.println("Oxygen\t\t" + fb.isOxygenFreezing() 
		+ "\t\t" + fb.isOxygenBoiling());
		System.out.println("Water\t\t" + fb.isWaterFreezing()
		+ "\t\t" + fb.isWaterBoiling());
	}
}
