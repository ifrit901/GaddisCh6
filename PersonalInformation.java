package ch6java6thedition;

/**
 * This is the personal information class.
 * 
 * @author craig
 */
public class PersonalInformation {
	// Class fields
	private String name;
	private String address;
	private int age;
	private String phoneNumber;

	// Constructors
	public PersonalInformation() {
		name = "";
		address = "";
		age = 0;
		phoneNumber = "";
	}

	public PersonalInformation(String n, String add, int a, String num) {
		name = n;
		address = add;
		age = a;
		phoneNumber = num;
	}

	// Getter methods

	/**
	 * The getName method returns the value in the name field
	 * @return name 
	 */
	public String getName() {
		return name;
	}

	/**
	 * The getAddress method returns the value in the address field
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * The getAge method returns the value in the age field
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * The getPhoneNumber method returns the value in the phoneNumber field
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * The setName method accepts a String argument and
	 * assigns its value to the name field
	 * @param n The name of the person
	 */
	public void setName(String n) {
		name = n;
	}

	/**
	 * The setAddress method accepts a String argument and 
	 * assigns its value to the address field
	 * @param add The person's address
	 */
	public void setAddress(String add) {
		address = add;
	}

	/**
	 * The setAge method accepts an integer argument and 
	 * assigns its value to the age field
	 * @param a The person's age
	 */
	public void setAge(int a) {
		age = a;
	}

	/**
	 * The setPhoneNumber method accepts a String argument and 
	 * assigns its value to the phoneNumber field
	 * @param num The person's phone number
	 */
	public void setPhoneNumber(String num) {
		phoneNumber = num;
	}

	/**
	 * The toString method overrides the toString method and
	 * formats the personal information fields better
	 * @return The formatted data
	 */
	@Override
	public String toString() {
		return String.format(name + "\n" + address + "\n" + age + 
			"\n" + phoneNumber);
	}
}
