package chapter02.exer;

import java.util.Scanner;

public class Exer02_03 {
	public static void main(String[] args) {
		
		/*논리형 변수를 이용하여 입력된 두 숫자의 크기를 비교하는 프로그램을 만들어보자. 
		 * 사용자로부터 정수 두 개를 입력받은 후 
		 * 처음 입력 받은 숫자가 다음에 입력 받은 숫자보다 
		 * 크면 true를, 작으면 false를 출력하도록 해보자. *
		 */
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요: ");
		int first = scanner.nextInt();
		System.out.println("두번째 수를 입력하세요: ");
		int second = scanner.nextInt();
	    
		// 처리 및 출력
		System.out.println("첫번째 수가 두번째 수보다 큰가? " + (first > second));
		
		scanner.close();
	}
}
