package ch6java6thedition;
import javax.swing.JOptionPane;
/**
 * This is Code Listing 6-9, an example of multiple instances of a class
 * being created. 
 * 
 * @author craig
 */
public class roomAreas {
	public static void main(String [] args) {
		double number;       // To hold a number
		double totalArea;    // The total area
		String input;        // To hold user input

		// Create three Rectangle objects
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle den     = new Rectangle();

		// Get and store the dimensions of the kitchen
		input = JOptionPane.showInputDialog(null, "What is the "
			+ "kitchen's length?");
		number = Double.parseDouble(input);

		// Call the setter(mutater) for length
		kitchen.setLength(number);

		input = JOptionPane.showInputDialog(null, "What is the "
			+ "kitchen's width?");
		number = Double.parseDouble(input);

		// Call the mutater for width
		kitchen.setWidth(number);

		// Get and store the dimensions of the bedroom
		input = JOptionPane.showInputDialog(null, "What is the "
			+ "bedroom's length?");
		number = Double.parseDouble(input);

		// Call the setter(mutater) for length
		bedroom.setLength(number);

		input = JOptionPane.showInputDialog(null, "What is the "
			+ "bedroom's width?");
		number = Double.parseDouble(input);

		// Call the mutater for width
		bedroom.setWidth(number);

		// Get and store the dimensions of the den
		input = JOptionPane.showInputDialog(null, "What is the "
			+ "den's length?");
		number = Double.parseDouble(input);

		// Call the setter(mutater) for length
		den.setLength(number);

		input = JOptionPane.showInputDialog(null, "What is the "
			+ "den's width?");
		number = Double.parseDouble(input);

		// Call the mutater for width
		den.setWidth(number);

		// Calculate the total area of the rooms
		totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();

		// Display the results
		JOptionPane.showMessageDialog(null, "The total area of the "
			+ "rooms is " + totalArea + " feet.");

		System.exit(0); 
	}	
}
