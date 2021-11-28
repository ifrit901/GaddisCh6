package ch6java6thedition;

/**
 * This is the SavingsAccount class from programming
 * challenge number 12.
 * 
 * @author craig
 */
public class SavingsAccount {
	// Class fields
	private double annualInterestRate;
	private double balance;

	// Constructors
	public SavingsAccount() {
		annualInterestRate = 0.0;
		balance = 0.0;
	}

	public SavingsAccount(double rate, double bal) {
		annualInterestRate = rate;
		balance = bal;
	}

	// Getters 

	/**
	 * The getBalance method returns the current value
	 * in the balance field.
	 * @return balance The balance in the account.
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * The getAnnualInterestRate method returns the 
	 * current value in the annualInterestRate field.
	 * @return annualInterestRate The annual interest rate.
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// Setters

	/**
	 * The setBalance method accepts a double argument
	 * and sets the balance field equal to its value.
	 * @param bal The starting balance of the account.
	 */
	public void setBalance(double bal) {
		balance = bal;
	}

	/**
	 * The setAnnualInterestRate method accepts a double
	 * argument and sets the annualInterestRate field
	 * equal to its value.
	 * @param rate The user-defined annual interest rate.
	 */
	public void setAnnualInterestRate(double rate) {
		annualInterestRate = rate;
	}

	/**
	 * The withdrawal method accepts a double argument and
	 * subtracts it from the current balance.
	 * @param withdrawal The amount taken out of the account.
	 */
	public void withdrawal(double withdrawal) {
		balance -= withdrawal;
	}

	/**
	 * The deposit method accepts a double argument and adds 
	 * it to the current balance.
	 * @param deposit The amount added to the account.
	 */
	public void deposit(double deposit) {
		balance += deposit;
	}

	/** 
	 * The addInterestRate method accepts an integer argument
	 * and uses it as the number of months the account is open
	 * for. It calculates the interest rate that should be 
	 * added to the account balance and adds it.
	 * @param months The number of months the account runs for.
	 */
	public void addInterestRate(int months) {
		balance += ((getAnnualInterestRate())/12) * balance;
	}
}
