package exer.ex02;

import java.util.Scanner;

public class e4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		double radius = scanner.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		double height = scanner.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * height;
		
		
		System.out.println("원기둥 밑변의 넓이는 " + area + "cm^2이고, 원기둥의 부피는 " + volume + "cm^2이다.");
	}
}
