package chapter06.exer;

public class Car {

	//필드
	private double speed;         //현재 속도
	private String color;		  //자동차 색상
	private static final double MAX_SPEED = 200;	  //차의 엔진이 허용하는 최대속력(상수)

	//생성자
	public Car() {
	}
	public Car(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setspeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	// 속도가 0보다 작거나 최대속력을 넘으면 현재 속력 유지 false
	public boolean speedUp(double speed) {
		if (0 > speed || speed > MAX_SPEED) {
			return false;
		} else { 
			this.speed += speed;
			return true;
		}

	}
	
}
