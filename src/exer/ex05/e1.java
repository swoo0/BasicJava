package exer.ex05;

public class e1 {
	public static void main(String[] args) {
		int[] value = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i : value) {
			if (i > max) {
				max = i;
			} else if (i < min) {
				min = i;
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}
