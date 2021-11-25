package chapter03.exam;

import java.util.Scanner;

public class Exam03_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		String value1 = scanner.next();

		System.out.print("두 번째 수: ");
		String value2 = scanner.next();
		
		double num1 = Double.parseDouble(value1);
		double num2 = Double.parseDouble(value2);
		// 데이터 처리 부분
			
        System.out.println("----------------");
        
        String result = (num2 == 0) || (num2 == 0.0) ? "결과: 무한대" : "결과:" + (num1/num2);

        System.out.println(result); 
        
        scanner.close();
        
//        if(num2 != 0.0) {
//        	System.out.println(("결과: ") + (num1/num2));
//        } else {
//        	System.out.println("결과: 무한대");
//        }
	}
}
