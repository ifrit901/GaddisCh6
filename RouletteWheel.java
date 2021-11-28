package ch6java6thedition;

/**
 * This is the RouletteWheel class. It was supposed 
 * to be called RoulettePocket, oh well. It simulates a 
 * roulette wheel spinning around. The Random class
 * is used to determine the numbers and colors of 
 * the wheel. It corresponds to programming challenge
 * number 15. 
 * 
 * @author craig
 */
public class RouletteWheel {
	// Class fields
	private int pocketNumber;

	// Contructors

	public RouletteWheel(int number) {
		pocketNumber = number;
	}

	// Getters
	public int getNumber() {
		return pocketNumber;
	}
	public String getColor(int number) {
		String pocketColor = "";
		
		if(number == 0) {
			pocketColor = "Green";
		}
		else if(number >=1 && number <= 10 && number % 2 != 0) {
			pocketColor = "Red";
		}
		else if(number >= 1 && number <= 10 && number % 2 == 0) {
			pocketColor = "Black";
		}
		else if(number >= 11 && number <= 18 && number % 2 != 0) {
			pocketColor = "Black";
		}
		else if(number >= 11 && number <= 18 && number % 2 == 0) {
			pocketColor = "Red";
		}
		else if(number >= 19 && number <= 28 && number % 2 != 0) {
			pocketColor = "Red";
		}
		else if(number >= 19 && number <= 28 && number % 2 == 0) {
			pocketColor = "Black";
		}
		else if(number >= 29 && number <= 36 && number % 2 != 0) {
			pocketColor = "Black";
		}
		else if(number >= 29 && number <= 36 && number % 2 == 0) {
			pocketColor = "Red";
		}
		else {
			pocketColor = "Error, you entered a number outside "
				+ "the acceptable range.";
		}
		return pocketColor;
	}
}
