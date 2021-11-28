package ch6java6thedition;

/**
 * This file will be used with the classes in the code listings in
 * chapter 6. Since this chapter is about classes, I may have to begin 
 * creating separate projects for the program challenges in this chapter. 
 * 
 * @author craig
 */
public class Ch6java6thEdition {
	public static void main(String[] args) {
		// Create an object of the rectangle class and 
		// assign it's address to the box variable.
		Code_Listing_6_2 box = new Code_Listing_6_2();

		// It has to be called Code_Listing_6_2 instead of 
		// Rectangle because I named it that before I knew
		// I'd need it to be something else

		// Now we will print that we are calling the setLength()
		// method and passing it a value
		System.out.println("Sending the value 10.0 to the "
			+ "setLength() method.");

		// Call the box object's setLength() method 
		box.setLength(10.0);

		// Now we will print that we are calling the setWidth()
		// method and passing it a value
		System.out.println("Sending the value 20.0 to the "
			+ "setWidth() method.");

		// Cal the box object's setWidth() method
		box.setWidth(20.0);

		// Set a variable to the length of the rectangle
		double size = box.getLength();
	
		// Display the data with the getter methods
		System.out.println("The rectangle's width is " + box.getWidth() + ",\n"
			+ "it's length is " + box.getLength() + " and it's area is " + box.getArea()+".");

		// Indicate that we're done
		System.out.println("Done");
	}
}
