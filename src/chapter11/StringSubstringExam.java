package chapter11;

public class StringSubstringExam {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);  // 6을 제외한 0~5 까지의 문자열을 반환한다.
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);    // 콤마가 없다면 7이후 끄느나기 문자열을 반환한다.
 		System.out.println(secondNum);
		
	}
}
