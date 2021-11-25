package chapter05.exam;

public class Exam05_04 {
	public static void main(String[] args) {
		
		int max = Integer.MIN_VALUE;
		int[] array = {1, 5, 3, 8, 2};

		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}

		// for each 문
//		for (int i : array) {
//			if(max < i) {
//			   max = i;	
//			}	
//		}
		System.out.println("max: " + max);
	}
}
