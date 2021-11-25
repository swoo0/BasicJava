package exer.ex05;

import java.util.Random;
import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		String[] ai = {"가위", "바위", "보"};
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String user = scanner.nextLine();
		int	r = random.nextInt(3);
		System.out.println("게이머: " + user);
		System.out.println("인공지능 컴퓨터: " + ai[r]);
		
		String result = "";
		if (user.equals(ai[r])) {
			result = "무승부";
		} else if (user.equals("가위") && ai[r].equals("보")
				|| user.equals("바위") && ai[r].equals("가위")
				|| user.equals("보") && ai[r].equals("바위")) {
			result = "user 승리!";
		} else {
			result = "ai 승리!";
		}
		System.out.println(result);
	}
}
