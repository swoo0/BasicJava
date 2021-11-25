package chapter03;

public class CompareOperator119 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);  // true
		boolean result2 = (num1 != num2);  // false
		boolean result3 = (num1 <= num2);  // true
		boolean result4 = (num1 > num2); // true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		char char1 = 'A'; //유니코드 65
		char char2 = 'B'; //유니코드 66
		boolean result5 = (char1 < char2);
		System.out.println(result5);
		String str1 = "A";
		String str2 = "B";
//		boolean result6 = (str1 < str2); // String은 비교연산자 사용 못함

		
	}

}
