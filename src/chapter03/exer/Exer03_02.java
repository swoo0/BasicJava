package chapter03.exer;

import java.util.Scanner;

public class Exer03_02 {
	public static void main(String[] args) {
		/*
		 * 메트로폴리스(거대도시)는 다음과 같은 2가지 조건 중 하나를 만족하여야 한다고 가정한다. 
		 * 어떤 도시가 메트로폴리스인지를 알아보는 프로그램을 작성하여 보자.
		 * (삼항연산자 사용)
		 * 메트로폴리스 조건
         * 1. 한 나라의 수도이고, 인구가 100만 이상이어야 한다. 
         * 2. 연 소득이 1억 이상인 인구가 50만 이상이어야 한다.
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수도입니까? (수도: 1, 수도아님: 0) ");
		int capital = scanner.nextInt();
		
		System.out.print("총 인구는?(단위: 만 )");
		int population = scanner.nextInt();
		
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만)");
		int income = scanner.nextInt();
		
		String result = ((capital == 1 && population >= 100) || (income >= 50)) ? "이 도시는 메트로폴리스 입니다." : "이 도시는 메트로폴리스가 아닙니다.";
		System.out.println(result);
		
		scanner.close();
		
	}
}
