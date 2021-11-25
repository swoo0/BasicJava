package exer.ex08.e1;

public class Triangle extends Shape {
	double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return side * Math.sqrt(3) / 2.0 ;
	}
	@Override
	public double perimeter() {
		return side * 3;
	}
	
	public String toString() {
		return "도형의 종류: 삼각형, 둘레:" + perimeter() + "cm, 넓이: " + area() + "cm2^,";
	}
}
