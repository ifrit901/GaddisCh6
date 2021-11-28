package ch6java6thedition;

/**
 * This is the CellPhone class from In the Spotlight ch. 6.
 * 
 * 	--------------------------------------------
 * 	|		CellPhone		   |
 * 	|------------------------------------------|
 * 	| - manufact:    String                    |
 * 	| - model:       String                    |
 * 	| - retailprice: Double                    |
 * 	|------------------------------------------|
 * 	| + CellPhone(man:String, mod:String,      |
 * 	|	      retailPrice:double);         |
 * 	| + setManufact(man:String):void           |
 * 	| + setModel(mod:String):void              |
 * 	| + setRetailPrice(price:double):void      |
 * 	| + getManufact():String       		   |
 * 	| + getModel():String   		   |
 * 	| + getRetailPrice():double		   |
 * 	--------------------------------------------
 * 
 * @author craig
 */
public class CellPhone {
	// Fields (don't forget to make them private)
	private String manufact;           // Name of the manufacturer
	private String model;              // Model number
	private double retailPrice;        // Retail price

	/**
	 * Constructor
	 * @param man The phone's manufacturer
	 * @param mod The phone's model number
	 * @param price The phone's retail price
	 */
	public CellPhone (String man, String mod, double price) {
		manufact = man;
		model = mod;
		retailPrice = price;
	}
	/**
	 * The setManufact method accepts a String argument
	 * to set the name of the phone's manufacturer.
	 * @param man The name of the manufacturer.
	 */
	public void setManufact(String man) {
		manufact = man;
	}
	/**
	 * The setModel method accepts a String argument
	 * to set the phone's model number.
	 * @param mod The phone's model number.
	 */
	public void setModel (String mod) {
		model = mod;
	}
	/**
	 * The setRetailPrice method accepts a double argument
	 * to set the phone's retail price.
	 * @param retailPrice The phone's retail price.
	 */
	public void setRetailPrice (double price) {
		retailPrice = price;
	}
	/**
	 * The getManufact method gets the name of the 
	 * manufacturer.
	 * @return The name of the manufacturer.
	 */
	public String getManufact () {
		return manufact;
	}
	/**
	 * The getModel method gets the model number
	 * of the phone.
	 * @return The phone's model number.
	 */
	public String getModel () {
		return model;
	}
	/**
	 * The getRetailPrice method gets the retail
	 * price of the phone.
	 * @return retailPrice.
	 */
	public double getRetailPrice () {
		return retailPrice;
	}

}
