package exer.ex06.e4;

public class Car {
	//필드
	private double speed;
	private String color;
	private final double MAX_SPEED = 200;
	
	//생성자
	public Car() {
	}
	public Car(String color) {
		this.color = color;
	}
	
	//메소드
	public double getSpeed() {
		return speed;
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
		if(speed > 0 && speed <= MAX_SPEED) {
			this.speed += speed;
			return true;
		} else {
			return false;
		}
	}

	public double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	
}