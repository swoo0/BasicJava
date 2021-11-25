package chapter04;

public class Exercise01 {
	public static void main(String[] args) {
		/*
		 * 1부터 100까지의 합을 구할 때, 
		 * 합이 1000이 넘을 떄의 숫자를
		 * 알아내는 프로그램
		 */
		
		int sum = 0;
        int i = 1; 
		
		for(i=1; i<=100; i++) {
			sum += i;
			if(sum > 1000) {
			break;
			}
		}
		System.out.println("합계가 1000이 넘을때의 숫자는 " + i);
	}
}