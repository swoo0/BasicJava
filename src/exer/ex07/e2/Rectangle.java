package exer.ex07.e2;

public class Rectangle extends Shape {
	//필드
	private double width;
	private double height;
	
	//생성자
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
	
	@Override
	public String toString() {
		return "도형의종류: 원, 둘레: " + perimeter() + "cm" + ", 넓이: " + area() + "cm^2";
	}
}
