package exer.ex02;

import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요: ");
		int first = scanner.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		int second = scanner.nextInt();
		
		scanner.close();
		
		boolean a = first > second ? true : false;
		
		System.out.print("첫번째 수가 두번째 수보다 큰가? " + a);
		 
	}
}
