package chapter06.exer;

public class Circle {

	double radius; // 반지름
	double x;      // x좌표
	double y;      // y좌표


	public Circle() {
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
			
	public double getRadius()	{
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius >= 0 ? radius : 0;
	}
	public double getX () {
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



}
