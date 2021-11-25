package exer.ex06.e5;

public class NewCar {
	//필드
	private double speed;
	private String color;
	private final double MAX_SPEED = killoToMile(200);
	
	//생성자
	public NewCar() {
		killoToMile(speed);
	}
	public NewCar(String color) {
		this.color = color;
	}
	
	//메소드
	public double getSpeed() {
		return mileToKillo(speed);
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if(this.speed + speed > 0 && this.speed + speed <= MAX_SPEED) {
			this.speed += speed;
			return true;
		} else {
			return false;
		}
	}
	public double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	
	private static double killoToMile(double distance) {
		return distance / 6; 
	}
	private static double mileToKillo(double distance) {
		return distance * 6; 
	}
	
	
}