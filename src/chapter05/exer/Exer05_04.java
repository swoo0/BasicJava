package chapter05.exer;

import java.util.Random;

public class Exer05_04 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] array = new int[6];
		int[] diceNum = {1,2,3,4,5,6};
		
		for (int i = 0; i < 10000; i++) {
			int dice = random.nextInt(6)+1;
			array[dice-1]++;
		}
		System.out.println("------------");
		System.out.println("면      빈도");
		System.out.println("------------");
		
		for (int i = 0; i < array.length; i++) {
		System.out.println(diceNum[i]+"       "+array[i]);
		}			

	}
}
