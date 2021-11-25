package chapter03.exer;

import java.util.Scanner;

public class Exer03_01 {
	public static void main(String[] args) {
		/*
		 * 두 정수를 입력받아 큰 수를 작은 수로 나눈 몫과
		 * 나머지를 출력하는 프로그램을 만들어 보자.
		 * 임의의 두 정수는 a, b에 대하여
		 * ((a + b) + |a - b|) / 2는 큰 수, ((a + b) - |a - b|) / 2는 작은 수이다.
		 * 절대값을 반환하는 메소드는 Math.abs(숫자)이다. 
		 * 만약 |-3|을 알아보고 싶으면 Math.abs(-3)이라고 쓰면 3이 반환된다. 
		 * 이것을 이용하여 만들어 보자.
		 * 어떤 수를 0으로 나누는 것은 수학적으로 성립하지 않으므로
		 * 0을 입력하지 않는다고 가정하고 프로그램을 작성 
		 */
				
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int first = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int second = scanner.nextInt();

		// 큰수
		int big = ((first + second) + Math.abs(first - second)) / 2;
		// 작은수
		int small = ((first + second) - Math.abs(first - second)) / 2;
		
		// 몫
		int share = big / small;
		// 나머지
		int remainder = big % small;
		
		// 출력
		System.out.println("큰 수를 작은 수 로 나눈 몫은 " + share + "이고, 나머지는 " + remainder+"이다.");
		
		scanner.close();
	}
}
