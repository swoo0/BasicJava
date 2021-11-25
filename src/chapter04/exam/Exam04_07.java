package chapter04.exam;

import java.util.Scanner;

public class Exam04_07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int amount = 0;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
		    int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("예금액> ");
				balance += scanner.nextInt();
				amount = balance;
				break;
			case 2:
				System.out.println("출금액> ");
				amount -= scanner.nextInt();
				if (balance >= amount) {
					balance -= amount;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
			case 3:
				System.out.println("잔고> " + amount);
				break;
			case 4:
				run = false;
				break;
			}
		}	
			
		
		System.out.println(" 프로그램 종료");
	}
}

