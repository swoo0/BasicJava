package exer.ex04;

import java.util.Scanner;

public class e3_1 {
	public static void main(String[] args) {
		int[] arrays = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		arrays[0] = scanner.nextInt();
		System.out.print("데이터베이스: ");
		arrays[1] = scanner.nextInt();
		System.out.print("화면 구현: ");
		arrays[2] = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		arrays[3] = scanner.nextInt();
		System.out.print("머신러닝: ");
		arrays[4] = scanner.nextInt();
		
		scanner.close();
		
		int total = 0;
		double average = 0;
		String result = "";
		
		for (int i : arrays) {
			total += i;
			average = (double)total / 5;		
		}

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
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		System.out.println("학점: " + result);
		
	}
}
