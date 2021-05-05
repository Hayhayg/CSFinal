/**Motorcycle.java
 * @author Halley Gissendanner
 * @version April 8, 2021
 */
public class Motorcycle extends Vehicle{

	private String acc; //Motorcycle's accessory
	
/**Default Constructor
 * 
 * @param make
 * @param acc
 */
	Motorcycle(String make, String acc){
		this.make = make;
		this.acc = acc;
	}
	
/**
 * @return String of the Motorcycle object
 */
	@Override
	public String toString() {
		return "Motorcycle\n\tMake: " + make + "\n\tAccessory: " + acc;
	}
	
	


}
