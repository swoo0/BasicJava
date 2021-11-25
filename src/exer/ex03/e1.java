package exer.ex03;

import java.util.Scanner;

public class e1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int first = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int second = scanner.nextInt();
	
		scanner.close();
		
		int high = ((first+second) + Math.abs(first-second)) / 2;
		int low = ((first+second) - Math.abs(first-second)) / 2;
		
		int x = high / low;
		int y = high % low;
		
		
		System.out.printf("큰 수를 작은 수로 나눈 몫은 %d이고, 나머지는 %d이다.", x, y);
	}
}
