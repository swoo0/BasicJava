package chapter02.exer;

import java.util.Scanner;

public class Exer02_05 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 500원, 100원, 50원, 10원짜리 동전의
		 * 갯수를 입력 받아 저금통 안에 총 얼마가 들어 있는지
		 * 출력하는 프로그램을 만들어 보자.
		 */
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("500원짜리 동전의 갯수: ");
		int won500 = scanner.nextInt(); 
		System.out.print("100원짜리 동전의 갯수: ");
		int won100 = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		int won50 = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수: ");
		int won10 = scanner.nextInt();
		
		int sum = won500 * 500 + won100 * 100 + won50 * 50 + won10 * 10; 
		System.out.println("저금통 안의 동전의 총 액수: " + sum);
		// String  : %s => 문자열, % => 정수, % => 실수
		
		scanner.close();
	}
}
