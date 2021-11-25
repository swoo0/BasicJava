package exer.ex02;

import java.util.Scanner;

public class e1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로의 길이는?(단위: m) ");
		double width = scanner.nextDouble();
		System.out.print("세로의 길이는?(단위: m) ");
		double height = scanner.nextDouble();
		
		double area = width * height;
		double perimeter = (width + height) * 2;
		
		scanner.close();
		
		System.out.printf("직사각형의 넓이: %.2f%n", area);
		System.out.printf("직사각형의 둘레: %.1f", perimeter);
		
	}
}
