/**Vehicle.java
 * @author Halley Gissendanner
 * @version April 8, 2021
 */
public abstract class Vehicle {
	protected String make; //make of the vehicle

/**@param make
 * @return boolean whether vehicle object's make equals the param make
 */
	public boolean isEqual(String make) {
		if(this.make.equals(make)) {
			return true;
		}
		else return false;
	}
	public abstract String toString();
}
