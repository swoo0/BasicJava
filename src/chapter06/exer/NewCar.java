package chapter06.exer;

public class NewCar {

	//필드
	private double speed;   //현재 속도
	private String color;   //자동차 색상
	private static double MAX_SPEED = killoToMile(200);  // 내부에선 mile로
	
	//생성자
	public NewCar() {
	}
	
	public NewCar(String color) {
		this.color = color;
	}
	
	//메소드
	public double getSpeed() {
		return mileToKillo(speed);    // 내보낼때 mile -> km 변환
	}
	public void setspeed(double speed) {
		this.speed = speed;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	//변환 메소드
	private static double killoToMile(double distance) {
		return distance / 1.6;
	}
	private static double mileToKillo(double distance) {
		return distance * 1.6;
	}	
	
	// 기능 메소드
	// speed < 한계속도 =   this.speed += speed 	true  
	// speed > 한계속도 =   		유지  	 		false
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);  // 외부에서 들어온 속도 km -> mile 변환
		if (this.speed + speed > 0 && this.speed + speed < MAX_SPEED) {
			this.speed += speed;
			return true;	
		} else {
			return false;
		}
	}

	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);   // 최대속도 mile -> km 변환
	}
}