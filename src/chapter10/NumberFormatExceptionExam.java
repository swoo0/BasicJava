package chapter10;

public class NumberFormatExceptionExam {
	public static void main(String[] args) {
		
		
		
		String date1 = "100";
		String date2 = "a100";
		int value1 = Integer.parseInt(date1);
		int value2 = Integer.parseInt(date2);
		int result = value1 + value2;
		System.out.println(result);
		
		
		
		
		
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//			System.err.println("입력된 데이터는 숫자 형식이 아닙니다.");
//		} finally {
//			System.out.println("실행 결과 출력");
//		}
		
	}
}
