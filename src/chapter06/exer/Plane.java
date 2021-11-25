package chapter06.exer;

public class Plane {
	
	private String manufacturer;   // 제작사
	private String model;         // 비행기 모델명
	private int maxNumberOfPassengers;    // 최대승객수
	private static int numberOfPlanes;           //지금까지 생성된 비행기 객체의 수, 정적 변수로 선언
										  // 객체가 생성될 때마다 생성자에서 증가시켜줌			
	Plane() {
		numberOfPlanes++;
	}
	
	Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this();
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		if(maxNumberOfPassengers > 0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
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
		if(maxNumberOfPassengers > 0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}

	@Override
	public String toString() {
		return "Plane [제조사: " + manufacturer + ", 모델명: " + model + ", 최대 승객수: "
				+ maxNumberOfPassengers + "]";
	}
	
}
