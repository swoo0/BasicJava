package chapter04;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		/*
		 * 2. 구구단 중 원하는 단을
		 * 입력받아 해당 단을
		 * 출력하는 프로그램
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 단을 입력하세요");
		int sel = scanner.nextInt();
		int i = 0;
		
        scanner.close();
		
		for(i=1; i<=9; i++) {
			System.out.println(sel + " x " + i + " = " + sel * i);

		}
	}
}
