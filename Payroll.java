package ch6java6thedition;

/**
 * This is the Payroll class from programming challenge number 5.
 * 
 * @author craig
 */
public class Payroll {
	// Class fields
	private String name;
	private int idNumber;
	private double payRate;
	private int numberOfHoursWorked;

	// Constructors

	public Payroll() {
		name = "";
		idNumber = 0;
		payRate = 0.0;
		numberOfHoursWorked = 0;
	}

	public Payroll(String n, int idNum) {
		name = n;
		idNumber = idNum;
	}

	// Getter methods

	/**
	 * Method for getting the name.
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method for getting the idNumber.
	 * @return idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * Method for getting the payrate.
	 * @return payrate.
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * Method for getting the hours worked
	 * @return numberOfHoursWorked
	 */
	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	// Setter methods

	/**
	 * The setName method accepts a String argument
	 * and assigns it to the name field.
	 * @param n The name of the employee.
	 */
	public void setName(String n) {
		name = n;
	}

	/** 
	 * The getIdNumber accepts an integer argument 
	 * and assigns it to the idNumber field.
	 * @param id The ID number of the employee.
	 */
	public void setIdNumber(int id) {
		idNumber = id;
	}

	/**
	 * The setPayRate method accepts a double argument
	 * and assigns it to the payRate field.
	 * @param rate The hourly pay rate of the employee.
	 */
	public void setPayRate(double rate) {
		payRate = rate;
	}

	/**
	 * The setNumberOfHoursWorked method has an entirely 
	 * too long name. It accepts an integer argument 
	 * and assigns it to the numberOfHoursWorked field.
	 * @param hrs The number of hours the employee worked. 
	 */
	public void setNumberOfHoursWorked(int hrs) {
		numberOfHoursWorked = hrs;
	}

	/**
	 * The grossPay method returns the calculated pay
	 * of hours times rate of pay.
	 * @return grossPay
	 */
	public double grossPay(int hrs, double rate) {
		double grossPay = hrs * rate;
		return grossPay;
	}

	/**
	 * The overridden toString method formats the employee information
	 * @return The formatted data.
	 */
	@Override
	public String toString() {
		return String.format("Employee: " + name + "\n"
		+ "ID: " + idNumber + "\n" + "Hours worked: " 
		+ numberOfHoursWorked + "\n" + "Gross pay: $" 
			+ grossPay(numberOfHoursWorked, payRate));
			
	} 
}
