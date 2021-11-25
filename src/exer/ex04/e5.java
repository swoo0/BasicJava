package exer.ex04;

import java.util.Random;
import java.util.Scanner;

public class e5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ran = new Random().nextInt(100)+1;
		
		while(true) {
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int user = scanner.nextInt();
			
			if (user > ran) {
				System.out.println("정답은 더 작은 수입니다.");
			} else if (user < ran) {
				System.out.println("정답은 더 큰 수입니다.");
			} else if (user == ran) {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println("게임을 종료합니다.");
		scanner.close();
	}
}