package ch6java6thedition;
import java.io.*;		// For files and exception handling
import java.util.Scanner;	// To read from the files
/**
 * This is a program to test the SavingsAccount class'
 * use of input files. 
 * 
 * @author craig
 */
public class DepositWithdrawal {
	// Main method
	public static void main(String [] args) throws IOException {
		// Variables and constants
		final double annualInterestRate = .06;
		      double 		balance = 500.00;
	
		// Create a File object
		File depositFile = new File("Deposits.txt");

		// Create a Scanner object for file reading
		Scanner depositReader = new Scanner(depositFile);
		
		// Create a SavingsAccount object
		SavingsAccount newAccount = new SavingsAccount(annualInterestRate, balance);

		while(depositReader.hasNext()) {
			String number = depositReader.nextLine();
			double deposit = Double.parseDouble(number);
			newAccount.deposit(deposit);
		}
		
		// Create a new File object for withdrawals
		File withdrawalFile = new File("withdrawals.txt");

		// Redirect the Scanner to the "withdrawals.txt" file
		Scanner withdrawalReader = new Scanner(withdrawalFile);

		while(withdrawalReader.hasNext()) {
			String number = withdrawalReader.nextLine();
			double withdrawal = Double.parseDouble(number);
			newAccount.withdrawal(withdrawal);
		}

		// Add the interest for one month
		newAccount.addInterestRate(1);

		// Display the results
		System.out.println("After all the deposits and withdrawals\n"
			+ "and interest added the balance for the account is:\n"
			+ String.format("%.2f", newAccount.getBalance()));
		withdrawalReader.close();
	}
			
}
