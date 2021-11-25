package chapter04;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 월을 입력받고
		 * 입력받은 월이 며칠까지 있는지
		 * 출력하는 프로그램
		 * 31일 1 3 5 7 8 10 12
		 * 30일 4 6 9 11
		 * 28일 2
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력 하시오.");
		int month = scanner.nextInt();
		
		if(month == 2) {
			System.out.println(month + "월은 28일 까지 입니다.");
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + "월은 30일 까지 입니다.");
		} else {
			System.out.println(month + "월은 31일 까지 입니다.");
		}
	}
}
