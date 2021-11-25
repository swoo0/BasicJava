package exer.ex05;

import java.util.Random;

public class e2 {
	public static void main(String[] args) {
		int[] lotto = new int[45];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}		
		
		Random randem = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int ran = randem.nextInt(45);
			int temp = 0;
			temp = lotto[i];
			lotto[i] = lotto[ran];
			lotto[ran] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
	
	}
}