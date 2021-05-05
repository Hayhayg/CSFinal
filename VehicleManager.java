/**VehicleManager.java
 * @author Halley Gissendanner
 * @version April 8, 2021
 */

import java.util.Scanner;
import java.util.ArrayList;

public class VehicleManager {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int choice = 0; //user's input
		String vehicleMake, towing, range, acc = "";
		boolean test = false; //boolean to control if statements when searching for makes
		Vehicle tester = null; //empty vehicle object to assign when searching for certain makes
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	//Prompting for user choice
		System.out.print("Welcome to Your Vehicle Manager\nfor all your truck, electric and motorcycle needs");
				while(choice != 9) {
		System.out.println("\nOptions:"
				+ "\n1) Add a truck"
				+ "\n2) Add an electric car"
				+ "\n3) Add a motorcycle"
				+ "\n4) Display a vehicle"
				+ "\n5) Display all vehicles"
				+ "\n6) Remove a vehicle"
				+ "\n9) Quit\n");
		System.out.print("Please choose from the above options: ");
		choice = keyboard.nextInt();
		switch (choice) {
			//creates new Vehicle object of Truck and adds to Array List
			case 1:			
				System.out.print("Please enter the make of the truck: ");
				vehicleMake = keyboard.next();
				System.out.print("Please enter the truck's towing capacity: ");
				towing = keyboard.next();
				Vehicle truck = new Truck(vehicleMake, towing);
				vehicleList.add(truck);
				break;
			//creates new Vehicle object of Electric Car and adds to Array List
			case 2:
				System.out.print("Please enter the make of the electric car: ");
				vehicleMake = keyboard.next();
				System.out.print("Please enter the electric car's driving range: ");
				range = keyboard.next();
				Vehicle electric = new ElectricCar(vehicleMake, range);
				vehicleList.add(electric);
				break;		
			//creates new Vehicle object of Motorcycle and adds to Array List
			case 3:
				System.out.print("Please enter the make of the motorcycle: ");
				vehicleMake = keyboard.next();
				System.out.print("Please enter any accessories on the motorcycle: ");
				acc = keyboard.next();
				Vehicle motorcycle = new Motorcycle(vehicleMake, acc);
				vehicleList.add(motorcycle);
				break;
			//displays vehicle based on make 
			case 4:	
				System.out.print("Please enter the make of the vehicle to display: ");
				vehicleMake = keyboard.next();
				int display = -1;
				test = false;
				tester = null;
				//cycles through each item in ArrayList
				for (int j=0; j<vehicleList.size(); j++) {
					tester = vehicleList.get(j);
					if (tester.isEqual(vehicleMake) == true) {
						display = j;
						test = true;
					}
				}
				//displays chosen vehicle if true
				if (test == true) {
					System.out.println(vehicleList.get(display));
				}
				else System.out.println("Sorry, could not find " + vehicleMake + " in the list");
				break;
			//displays all vehicles
			case 5:	
				System.out.print("Displaying " + vehicleList.size() + " vehicles:\n");
				for(Vehicle i: vehicleList) {
				System.out.println(i);
					}
				break;
			case 6:	
				System.out.print("Please enter the make of the vehicle to remove: ");
				vehicleMake = keyboard.next();
				int remove = -1;
				test = false;
				tester = null;
				//cycles through ArrayList
				for (int j=0; j<vehicleList.size(); j++) {
					tester = vehicleList.get(j);
					if (tester.isEqual(vehicleMake) == true) {
						remove = j;
						test = true;
					}
				}
				//removes chosen vehicle if it exists
				if (test == true) {
					System.out.println("Removing: \n" + vehicleList.get(remove));
					vehicleList.remove(remove);
				}
				else System.out.println("Sorry, could not find " + vehicleMake + " in the list");
				break;
			case 9:	
				System.out.print("Goodbye");
				break;
			default:	
				System.out.print("Sorry, " + choice + " is not a valid option.");
				choice = 0;
				break;
			
		}
		}
		
	}

}
