package ch6java6thedition;

/**
 * This tests the Car class.
 * 
 * @author craig
 */
public class CarTest {
	public static void main(String [] args) {
		// Create an object of the Car class
		Car car1 = new Car(1993, "Corvette");

		// Call the accelerate method five times
		// and display the changes it makes
		car1.accelerate();
		System.out.println("The car's speed is now " + car1.getSpeed());
		
		car1.accelerate();
		System.out.println("The car's speed is now " + car1.getSpeed());

		car1.accelerate();
		System.out.println("The car's speed is now " + car1.getSpeed());

		car1.accelerate();
		System.out.println("The car's speed is now " + car1.getSpeed());

		car1.accelerate();
		System.out.println("The car's speed is now " + car1.getSpeed());

		// Call the brake method five times 
		// and display the changes it makes
		car1.brake();
		System.out.println("After braking, the car's speed is now " 
				   + car1.getSpeed());

		car1.brake();
		System.out.println("After braking, the car's speed is now " 
				   + car1.getSpeed());

		car1.brake();
		System.out.println("After braking, the car's speed is now " 
				   + car1.getSpeed());

		car1.brake();
		System.out.println("After braking, the car's speed is now " 
				   + car1.getSpeed());

		car1.brake();
		System.out.println("After braking, the car's speed is now " 
				   + car1.getSpeed());

	}	
}
