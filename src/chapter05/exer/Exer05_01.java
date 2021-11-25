package chapter05.exer;

public class Exer05_01 {
	public static void main(String[] args) {
		int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i : array) {
			max = max > i ? max : i;
			min = min < i ? min : i;
		}
		System.out.println("최대값: " + max);	
		System.out.println("최소값: " + min);	
	}
}
