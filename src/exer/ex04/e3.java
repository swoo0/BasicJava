package exer.ex04;

import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int programing = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int db = scanner.nextInt();
		System.out.print("화면 구현: ");
		int screen = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int application = scanner.nextInt();
		System.out.print("머신러닝: ");
		int machine = scanner.nextInt();
		
		scanner.close();
		
		int total = programing + db + screen + application + machine;
		double average = (double)total / 5;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		
		String result = "";
		
		if(average > 90) {
			result = "A";
		} else if (average > 80) {
			result = "B";
		} else if (average > 70) {
			result = "C";
		} else if (average > 60) {
			result = "D";
		} else {
			result = "F";
		}
		System.out.println("학점: " + result);
	}
}
