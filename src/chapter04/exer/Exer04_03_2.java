package chapter04.exer;

import java.util.Scanner;

public class Exer04_03_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		int[] scores = new int[5]; // 0~4
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextInt();
			System.out.print(scores[i]);
		}
		
		int total = 0;
		
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		
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
