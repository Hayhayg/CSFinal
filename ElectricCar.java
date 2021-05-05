/**ElectricCar.java
 * @author Halley Gissendanner
 * @version April 8, 2021
 */
public class ElectricCar extends Vehicle {
	private String range;

/**Default Constructor
 * 	
 * @param make
 * @param range
 */
	ElectricCar(String make, String range){
		this.make = make;
		this.range = range;
	}

/**
 * @return String of the Electric Car \bject
 */
	@Override
	public String toString() {
		return "Electric Car\n\tMake: " + make + "\n\tDriving range: " + range;
	}



}
