/**Truck.java
 * @author Halley Gissendanner
 * @version April 8, 2021
 */
public class Truck extends Vehicle{

	private String towing; //truck's towing capacity
/**Default Constructor
 * 
 * @param make
 * @param towing
 */
	Truck (String make, String towing){
		this.make = make;
		this.towing = towing;
	}
	
	
	
/**
 * @return String of the Truck object
 */
	@Override
	public String toString() {
		return "Truck\n\tMake: " + make + "\n\tTowing capacity: " + towing;
	}





}
