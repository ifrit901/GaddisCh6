package ch6java6thedition;

/**
 * This is the employee class for programming challenge 1.
 * 
 * @author craig
 */
public class Employee {
	// Instance fields
	private String name;	
	private int idNumber;
	private String department;
	private String position;

	// Constructors
	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	public Employee(String n, int id) {
		name = n;
		idNumber = id;
		department = "";
		position = "";
	}
	
	public Employee(String n, int id, String dep, String pos) {
		name = n;
		idNumber = id;
		department = dep;
		position = pos;
	}

	// Setter Methods

	/**
	 * The setName method receives a String argument and sets the 
	 * name field equal to it.
	 * @param n The name  of the employee.
	 */
	public void setName(String n) {
		name = n;
	}
	
	/**
	 * The setIdNumber method accepts an int argument and sets the
	 * idNumber field equal to it. 
	 * @param id The ID number of the employee.
	 */
	public void setIdNumber(int id) {
		idNumber = id;
	}

	/**
	 * The setDepartment method accepts a String argument and sets
	 * it equal to the department field.
	 * @param dep The department of the employee.
	 */
	public void setDepartment(String dep) {
		department = dep;
	}

	/**
	 * The setPosition method accepts a String argument and sets
	 * the position field equal to it.
	 * @param pos The position of the employee.
	 */
	public void setPosition(String pos) {
		position = pos;
	}

	// Getter Methods

	/**
	 * The getName method returns the String value in the name
	 * field.
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * The getIdNumber method returns the int value in the 
	 * idNumber field. 
	 * @return idNumber.
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * The getDepartment method returns the String value in
	 * the department field.
	 * @return department.
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * The getPosition method returns the String value in 
	 * the position field.
	 * @return position.
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * The book doesn't ask for a modified toString method
	 * but since I figured out how to do it I'm gonna go 
	 * ahead and practice it.
	 * @return The formatted object data.
	 */
	@Override
	public String toString() {
		return String.format(name + "\n"
				   + idNumber + "\n"
				   + department + "\n"
				   + position + "\n\n");
	}
}
