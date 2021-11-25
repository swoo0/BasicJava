package chapter08.exer.e01;

public class Rectangle extends Shape {
	//필드
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
	@Override
	public double perimeter() {
		return (width + height) * 2;
	}
	
	public String toString() {
		return String.format("도형의 종류: 사각형, 둘레: %.2fcm, 넓이: %.2fcm2^", perimeter(), area());
	}

}
