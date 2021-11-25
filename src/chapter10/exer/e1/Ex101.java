package chapter10.exer.e1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex101 {
	public static void main(String[] args) {	
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("어떤 수를 나누시겠습니까?>> ");
				int dividend = Integer.parseInt(scanner.next());
				System.out.print("어떤 수로 나누시겠습니까?>> ");
				int divisor = Integer.parseInt(scanner.next());
				int result = dividend / divisor;
				System.out.println(dividend + " / " + divisor + " = " + result);
				break;
			} catch (InputMismatchException | NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			} 
		}
		
	}
}
