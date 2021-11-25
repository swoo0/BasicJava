package chapter06;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;

	

	public static void main(String[] arg) {
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + " km");
		System.out.println("지구의 표면적: " + Earth.EARTH_AREA + " km^2");

	
	}
}