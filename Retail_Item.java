package ch6java6thedition;

/**
 * This is the Retail_Item class from programming challenge #4.
 * 
 * @author craig
 */
public class Retail_Item {
	// Class fields 
	private String description;
	private int numberOnHand;
	private double price;

	// Constructors
	public Retail_Item() {
		description = "";
		numberOnHand = 0;
		price = 0.0;
	}

	public Retail_Item(String desc, int num, double cost) {
		description = desc;
		numberOnHand = num;
		price = cost;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the numberOnHand
	 */
	public int getNumberOnHand() {
		return numberOnHand;
	}

	/**
	 * @param numberOnHand the numberOnHand to set
	 */
	public void setNumberOnHand(int numberOnHand) {
		this.numberOnHand = numberOnHand;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Override the toString method for a tidy formatting 
	 * of the data
	 * @return The formatted object data
	 */
	@Override 
	public String toString() {
		return String.format(description + "\t\t"
		                    + numberOnHand + "\t\t" + price);
				    
	}
}
