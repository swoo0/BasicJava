package chapter02.exer;

import java.util.Scanner;

public class Exer02_01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
			
		System.out.print("가로의 길이는?(단위: m): ");
		double width = scanner.nextDouble();
		System.out.print("세로의 길이는?(단위: m): ");
		double height = scanner.nextDouble();

		double area = width * height;
		double premeter = (width + height) * 2;
			
		System.out.println("직사각형의 넓이: " + area);
	    System.out.println("직사각형의 둘레: " + premeter);
		    
		scanner.close();
	}	
}
