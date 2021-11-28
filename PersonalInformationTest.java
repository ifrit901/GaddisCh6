package ch6java6thedition;

/**
 * This is a test for the PersonalInformation class.
 * 
 * @author craig
 */
public class PersonalInformationTest {
	// Main method
	public static void main(String [] args) {
		// Create three PersonalInformation objects
		PersonalInformation craig = new PersonalInformation
		("Craig Parker", "8164 Manchester Circle", 45, "901-552-8277");

		PersonalInformation susan = new PersonalInformation
		("Susan Parker", "11607 Spill Creek Dr.", 39, "281-705-4200");

		PersonalInformation lorraine = new PersonalInformation
		("Lorraine Parker", "2894 Billy Cross", 76, "901-216-2158");

		// Use some methods to get some of the information
		System.out.println("This program has stored personal "
			+ "information about some of my family members.\n"
			+ "The following demonstrates some getter methods "
			+ "to retrieve the data.\n\n");

		System.out.println("My little sister's phone number is #" +
			susan.getPhoneNumber());

		System.out.println("My Mom's address is " + 
			lorraine.getAddress());

		System.out.println("My name is " + craig.getName()); 

		System.out.println("\nThe complete information for each "
			+ "person is:\n" + lorraine.toString() + "\n\n" 
			+ susan.toString() + "\n\n" + craig.toString() + "\n\n");
	}
}
