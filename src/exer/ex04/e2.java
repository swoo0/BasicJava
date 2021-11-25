package exer.ex04;

import java.util.Scanner;

public class e2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12): ");
		int value = scanner.nextInt();

		scanner.close();
		
		if(value >= 1 && value < 6) {
			System.out.println(value + "월은 봄입니다.");
		} else if(value >= 6 && value < 9) {
			System.out.println(value + "월은 여름입니다.");
		} else if(value >= 9 && value < 11) {
			System.out.println(value + "월은 가을입니다.");
		} else if(value == 12 && value == 1 && value == 2) {
			System.out.println(value + "월은 겨울입니다.");
		} else { 
			System.out.println(value + "월은 잘못된 입력입니다.");
		}	
	}
}
