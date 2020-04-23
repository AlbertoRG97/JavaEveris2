package operations;

import model.computer;
import model.car;

public class helper {
	
	public static void addRam(computer c, int r) {
		c.setRam(c.getRam()+r);
	}
	
	public static void addWeight(car c, int w) {
		c.setWeight(c.getWeight()+w);
	}
	
	public static void addPassenger(car c, int p) {
		c.setPassengers(c.getPassengers()+p);
	}
}
