package chapter04;

//import java.util.Scanner;

public class IfElseIfElse139 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int score = scanner.nextInt();
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90점입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89입니다");
		    System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("점수가 80~89입니다");
		    System.out.println("등급은 C입니다."); 
	    } else {
			System.out.println("점수가 70 미만입니다.");
		    System.out.println("등급은 D입니다.");
	    }  
	}
}
