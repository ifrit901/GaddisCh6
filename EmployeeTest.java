package ch6java6thedition;

/**
 * This is for testing the Employee class.
 * 
 * @author craig
 */
public class EmployeeTest {
	public static void main (String [] args) {
		// Create three objecs of the Employee class
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		// Set the fields for the first employee
		e1.setName("Susan Myers");
		e1.setIdNumber(47899);
		e1.setDepartment("Accounting");
		e1.setPosition("Vice President");

		// Set the fields for the second employee
		e2.setName("Mark Jones");
		e2.setIdNumber(39119);
		e2.setDepartment("IT");
		e2.setPosition("Programmer");

		// Set the fields for the second employee
		e3.setName("Joy Rogers");
		e3.setIdNumber(81744);
		e3.setDepartment("Manufacturing");
		e3.setPosition("Engineer");
		
		// Print out the Information for each employee
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}	
}
