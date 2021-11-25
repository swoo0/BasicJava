package chapter06;

public class FirstCar {
	String company;
	String model;
	String color;
	int maxspeed;
	int speed;
	public FirstCar() {
	}
	// 생성자 주입(injection)
	public FirstCar(String m,String c, int s) {
		model = m;
		color = c;
		maxspeed = s;
		
	}
	
	public static void main(String[] args) {
		FirstCar car1 = new FirstCar();
		FirstCar car2 = new FirstCar();
		System.out.println(car1.model);
		System.out.println(car1.speed);
		car1.model = "소나타";
		System.out.println(car1.model);
	}
	
}
