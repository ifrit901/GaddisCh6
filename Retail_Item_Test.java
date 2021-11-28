package ch6java6thedition;

/**
 * This is a test for the Retail_Item class.
 * 
 * @author craig
 */
public class Retail_Item_Test {
	public static void main (String [] args) {
		// Create three instances of the Retail_Item class
		Retail_Item r1 = new Retail_Item();
		Retail_Item r2 = new Retail_Item();
		Retail_Item r3 = new Retail_Item();

		// Add some data to the three object's fields with 
		// the . operator
		r1.setDescription("Jacket");
		r1.setNumberOnHand(12);
		r1.setPrice(59.95);

		r2.setDescription("Jeans");
		r2.setNumberOnHand(40);
		r2.setPrice(34.95);
		
		r3.setDescription("Shirt");
		r3.setNumberOnHand(20);
		r3.setPrice(24.95);

		// Create a chart that displays these fields
		System.out.println("\t\tDescription\tUnits on Hand\tPrice");
		System.out.println("__________________________________________"+
			"______________");
		System.out.println("Item #1\t\t" + r1.toString());
		System.out.println("Item #2\t\t" + r2.toString());
		System.out.println("Item #3\t\t" + r3.toString());


	}	
}
