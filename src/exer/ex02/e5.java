package exer.ex02;

import java.util.Scanner;

public class e5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수: ");
		int krw500 = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수: ");
		int krw100 = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		int krw50 = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수: ");
		int krw10 = scanner.nextInt();
		
		scanner.close();

		int total  = krw500*500 + krw100*100 + krw50*50 + krw10*10;
		
		System.out.printf("저금통 안의 동전의 총 액수: %d", total);
	}
}
