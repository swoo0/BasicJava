package chapter08.exer.e01;

public class Triangle extends Shape {
	double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return side * side * Math.sqrt(3) / 4.0 ;
	}
	@Override
	public double perimeter() {
		return side * 3;
	}
	
	public String toString() {
		return String.format("도형의 종류: 삼각형, 둘레: %.2fcm, 넓이: %.2fcm2^", perimeter(), area());
	
	}
}
