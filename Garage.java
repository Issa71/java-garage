package garage;

import java.util.ArrayList;
import java.util.Iterator;

public class Garage {

	    public Garage() {

	        ArrayList<Vehicle> vehicleCollections = new ArrayList<>();
	    }

	    ArrayList<Vehicle> vehicleCollections = new ArrayList<>();

	    public Vehicle createVehicle(String a, String name) {

	        Vehicle x = null;

	        if (a.equalsIgnoreCase("m")) {

	            MotorCycle bike = new MotorCycle();
	            bike.setId(a);
	            bike.setName(name);
	            bike.setEngineSize(a);
	            bike.setSideCarAttachment(Boolean.TRUE);
	            bike.setColour(a);
	            x = bike;

	        } else if (a.equalsIgnoreCase("c")) {

	            Car car = new Car();
	            car.setId(a);
	            car.setName(name);
	            car.setEngineSize(a);
	            car.setBootSize(a);
	            car.setConvertible(Boolean.TRUE);
	            x = car;

	        } else if (a.equalsIgnoreCase("t")) {

	            Van van = new Van();
	            van.setId(a);
	            van.setName(name);
	            van.setEngineSize(a);
	            van.setDoors(2);
	            x = van;

	        }
	        return x;
	    }

	    public void addVehicle(Vehicle x) {

	        vehicleCollections.add(x);

	    }

	    public void removeVehicle(ArrayList<Vehicle> y, String a) {

	        Iterator<Vehicle> it = vehicleCollections.iterator();
	        while (it.hasNext()) {
	            if (it.next().getName().equalsIgnoreCase(a)) {
	                it.remove();
	            }

	        }

	    }

	    public static void emptyGarage(ArrayList<Vehicle> y) {

	        y.clear();
	        System.out.println("Garage has been emptied");
	    }

	    public void printGarage(ArrayList<Vehicle> x) {

	        int bill;
	        int basePrice = 100;

	        for (Vehicle a : x) {

	            if (a instanceof Car) {
	                bill = basePrice * 2;
	                System.out.println("The bill for Car: " + a.getName() + " is £" + bill);
	            } else if (a instanceof MotorCycle) {
	                bill = basePrice * 3;
	                System.out.println("The bill for Motor Cycle: " + a.getName() + " is £" + bill);
	            } else if (a instanceof Van) {
	                bill = basePrice * 4;
	                System.out.println("The bill for Van: " + a.getName() + " is £" + bill);
	            }

	        }

	    }
}
