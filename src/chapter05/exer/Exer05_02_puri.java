package chapter05.exer;

import java.util.Random;

public class Exer05_02_puri {
	public static void main(String[] args) {

		int[] num = new int[45];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}                                                  
		Random random = new Random();
		for (int i = 0; i < num.length; i++) {
			int ran = random.nextInt(45);    
			int temp = num[i];                         // 1 2 3 4 5 6 7 8 9 10
			num[i] = num[ran];
			num[ran] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(num[i] + " ");
		}
	}
}
