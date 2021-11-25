package chapter06.exer;

public class PlaneTest {
	public static void main(String[] args) {
		Plane plane1 = new Plane("보잉", "보잉 747", 450);
		System.out.println(plane1);
		System.out.println();
		
		Plane plane2 = new Plane("보잉", "보잉 777", 500);
		System.out.println(plane2);
	
		System.out.println();
		
		Plane plane3 = new Plane();
		plane3.setManufacturer("록히드 마틴");
		plane3.setModel("F-22");
		plane3.setMaxNumberOfPassengers(-10);
		
		System.out.println(plane3);

		System.out.println();
		
		System.out.println("생산된 비행기의 수: " + Plane.getNumberOfPlanes());
		
	}
}
