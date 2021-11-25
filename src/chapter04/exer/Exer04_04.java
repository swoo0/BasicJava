package chapter04.exer;

import java.util.Scanner;

public class Exer04_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위 바위 보 게임");
		
		System.out.print("철수: ");
		String man = scanner.nextLine();
		System.out.print("영희: ");
		String woman = scanner.nextLine();
		
        scanner.close();
		
		String result = "";
		
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
	}
}

