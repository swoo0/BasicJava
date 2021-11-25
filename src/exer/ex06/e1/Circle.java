package exer.ex06.e1;

public class Circle {
	//필드
	double radius;
	double x;
	double y;
	
	//생성자
	public Circle() {
	}

	//메소드
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius > 0 ? radius : 0; 
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

}
