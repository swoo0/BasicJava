package exer.ex07.e2;

public class Triangle extends Shape {
	//필드
	private double side;
	
	//생성자
	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return side * Math.sqrt(3) / 2.0;
	}

	@Override
	public double perimeter() {
		return side * 3; 
	}
	
	@Override
	public String toString() {
		return "도형의종류: 원, 둘레: " + perimeter() + "cm" + ", 넓이: " + area() + "cm^2";
	}
}
