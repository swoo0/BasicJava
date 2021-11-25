package chapter08.exer.e01;

public class Circle extends Shape {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {  //넓이
		return radius * radius * Math.PI;
	}

	@Override
	public double perimeter() {    //둘레
		return radius * 2 * Math.PI;
	}

	public String toString() {
		return String.format("도형의 종류: 원, 둘레: %.2fcm, 넓이: %.2fcm2^", perimeter(), area());
	}
	
}
