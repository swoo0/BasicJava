package chapter04.exer;

import java.util.Scanner;

public class Exer04_03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int scores[] = new int[5];
		
		System.out.print("프로그래밍 기초: ");
		int programing = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int datebase = scanner.nextInt();
		System.out.print("화면 구현: ");
		int screen = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int applications = scanner.nextInt();
		System.out.print("머신러닝: ");
		int machine = scanner.nextInt();
		
		int total = programing + datebase + screen + applications + machine;
	    double average = (double)total / 5;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		
        scanner.close();
        
        char grade = 'F';
		if(average >= 90) {
			grade = 'A';
		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else if (average >= 60) {
			grade = 'D';
		}
		System.out.println("학점: " + grade);
	}
}
