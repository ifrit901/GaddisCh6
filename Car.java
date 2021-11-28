package ch6java6thedition;

/**
 * The Car class.
 * 
 * @author craig
 */
public class Car {
	// Class fields
	private int yearModel;	
	private String make;
	private int speed;

	// Constructors
	public Car(int year, String type) {
		yearModel = year;
		make = type;
		speed = 0;
	}

	// Accessor methods

	/**
	 * The getYearModel returns the value in the 
	 * yearModel field.
	 * @return yearModel.
	 */
	public int getYearModel() {
		return yearModel;
	}
	
	/**
	 * The getMake method returns the value in the 
	 * make field.
	 * @return make.
	 */
	public String getMake() {
		return make;
	}

	/**
	 * The getSpeed method returns the value in the 
	 * speed field.
	 * @return speed.
	 */
	public int getSpeed() {
		return speed;
	}

	// Mutator methods

	/**
	 * The accelerate method increases the value in the
	 * speed field by 5.
	 */
	public void accelerate() {
		speed += 5;
	}

	/**
	 * The brake method decreases the value in the
	 * speed field by 5.
	 */
	public void brake() {
		speed -= 5;
	}
}
