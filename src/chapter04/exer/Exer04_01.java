package chapter04.exer;

import java.util.Scanner;

public class Exer04_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int first = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int second = scanner.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int third = scanner.nextInt();
		
		scanner.close();
		
		if(first < (second + third) && second < (first + third) && third < (first + second)) {
			System.out.println("삼각형을 만들 수 있습니다."); 
		} else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
	}
}
