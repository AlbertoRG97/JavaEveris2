package model;

public class car {
	private int passengers;
	private String model;
	private String weight;
	
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public car(int passengers, String model, String weight) {
		super();
		this.passengers = passengers;
		this.model = model;
		this.weight = weight;
	}
	
	
}
