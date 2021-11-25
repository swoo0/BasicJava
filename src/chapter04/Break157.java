package chapter04;

import java.util.Random;

public class Break157 {
	public static void main(String[] args) {
		/*
		 * 주사위를 던져서 6이 나오면 반복문을 종료
		 */

		Random random = new Random();
		
		while (true) {
			int dice =random.nextInt(6) + 1;
			System.out.println(dice);
			if (dice % 2 == 1) {
				//반복문 종료
				continue;
			}
			System.out.println(dice);
			if (dice == 6) {
				break;
			}
		
		
		
		
//		int diceValue = 0;
//		while(diceValue != 3) {
//			diceValue = random.nextInt(6) + 1;
//			System.out.println(diceValue);
//		}
		}
	}
}
