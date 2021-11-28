package ch6java6thedition;

/**
 * This class corresponds to Program Challenge #11.
 * It returns boolean values for the freezing and 
 * boiling points of different substances.
 * 
 * @author craig
 */
public class FreezingBoiling {
	private int temperature;

	public FreezingBoiling() {
		temperature = 0;	
	}

	public FreezingBoiling(int temp) {
		temperature = temp;
	}

	/**
	 * The setTemp method accepts an int argument
	 * and sets the temperature variable to its value.
	 * @param temp The user defined temperature.
	 */
	public void setTemp(int temp) {
		temperature = temp;
	}

	/**
	 * The getTemp method returns the value in 
	 * the temperature field.
	 * @return  The temperature value in the temperature field.
	 */
	public int getTemp() {
		return temperature;
	}

	/**
	 * The isEthylFreezing method calls the getTemp()
	 * method as an argument and returns a boolean value
	 * indicating whether the substance will freeze 
	 * at the given temperature.
	 * @param temp The temperature argument
	 * @return freezing If the substance is freezing.
	 */
	public boolean isEthylFreezing() {
		boolean freezing = true;
		return (getTemp() <= -173) ? freezing : !freezing;
		}

	/**
	 * The isEthylBoiling method calls the getTemp()
	 * method and returns a boolean value
	 * indicating whether the substance will boil 
	 * at the given temperature.
	 * @return boiling If the substance is boiling.
	 */
	public boolean isEthylBoiling() {
		boolean boiling = true;
		return (getTemp() >= 172) ? boiling : !boiling;
	}

	/**
	 * The isOxygenFreezing method calls the getTemp()
	 * method and returns a boolean value indicating
	 * whether the substance will freeze at the
	 * given temperature.
	 * @return freezing If the substance is freezing.
	 */
	public boolean isOxygenFreezing() {
		boolean freezing = true;
		return (getTemp() <= -362 ? freezing : !freezing);
	}

	/** 
	 * The isOxygenBoiling method calls the getTemp()
	 * method and returns a boolean value indicating
	 * whether the substance will boil at the 
	 * given temperature.
	 * @return boiling If the substance is boiling.
	 */
	public boolean isOxygenBoiling() {
		boolean boiling = true;
		return (getTemp() >= -306 ? boiling : !boiling);
	}

	/**
	 * The isWateFreezing method calls the getTemp()
	 * method and returns a boolean value indicating
	 * whether the substance will freeze at the 
	 * given temperature.
	 * @return freezing If the substance is freezing.
	 */
	public boolean isWaterFreezing() {
		boolean freezing = true;
		return (getTemp() <= 32 ? freezing : !freezing); 
	}

	/**
	 * The isWaterBoiling method calls the getTemp()
	 * method and returns a boolean value indicating
	 * whether the substance will boil at the 
	 * given temperature.
	 * @return boiling If the substance is boiling.
	 */
	public boolean isWaterBoiling() {
		boolean boiling = true;
		return (getTemp() >= 212 ? boiling : !boiling);
	}
}
