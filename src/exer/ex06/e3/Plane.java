package exer.ex06.e3;

public class Plane {
	//필드
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;

	//생성자
	public Plane() {
		numberOfPlanes++;
	}	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers > 0 ? maxNumberOfPassengers : 0;
		numberOfPlanes++;
	}
	
	//메소드
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		this.maxNumberOfPassengers = maxNumberOfPassengers > 0 ? maxNumberOfPassengers : 0;
	}

	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
}
