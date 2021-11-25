package chapter05.exer;

import java.util.Random;
import java.util.Scanner;

public class Exer05_03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] ai = {"가위", "바위", "보"};
		System.out.print("가위 바위 보를 입력하세요: ");
		String gamer = scanner.next();
		
		int j = random.nextInt(3);
		System.out.println("게이머: " + gamer);
		System.out.println("인공지능 컴퓨터: " + ai[j]);			
		
		String result = " ";
		if(gamer.equals(ai[j])) {
			result = "무승부";
		} else if (gamer.equals("가위") && ai[j].equals("보")
			|| gamer.equals("바위") && ai[j].equals("가위")
			|| gamer.equals("보") && ai[j].equals("바위")) {
			result = "결과: 게이머 승리";
		} else {
			result = "결과: 인공지능 컴퓨터 승리!";
		}
		System.out.println(result);
	}
}

/*
if(man.equals(woman)) {
result = "무승부";
} else if (man.equals("가위") && woman.equals("보")
	|| man.equals("바위") && woman.equals("가위")
	|| man.equals("보") && woman.equals("바위")) {
result = "철수 승리!";
} else {
result = "영희 승리!";
}
System.out.println(result);
*/