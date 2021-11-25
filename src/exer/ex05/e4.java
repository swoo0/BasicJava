package exer.ex05;

import java.util.Random;

public class e4 {
	public static void main(String[] args) {
		int[] dice = {1, 2, 3, 4, 5, 6};
		
		Random random = new Random();

		for (int i = 0; i < 10000; i++) {
			int ran = random.nextInt(6);
			dice[ran]++;
		}
		System.out.println("----------------");
		System.out.println("면          빈도");
		System.out.println("----------------");
	
		for (int j = 0; j < dice.length; j++) {
		System.out.printf("%d           %d%n", j+1, dice[j]);
			
		}
	}
}
