package ex08.e1;

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
		return "도형의 종류: 원, 둘레:" + perimeter() + "cm, 넓이: "+ area() + "cm2^";
	}
	
}
