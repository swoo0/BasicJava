package chapter04;

public class Formultiolicationtable153 {
	public static void main(String[] args) {
//		// nested loop 중접반복문
//        int sum = 0;
//        
//        int i = 1;
//        
//        while(i<=100) {
//          sum += i;
//          i++;
//        }
//        System.out.println("1~" + (i-1) + " 합 : " + sum);
		
		for (int m = 1; m <= 9; m++) {
			for (int n = 2; n <= 9; n++) {
				System.out.print(n + " x " + m + " = " + (m * n));
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
