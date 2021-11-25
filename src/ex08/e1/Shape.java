package ex08.e1;

public abstract class Shape implements Comparable<Shape> {
	abstract double area();
	abstract double perimeter();
	
	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
