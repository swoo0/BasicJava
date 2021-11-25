package chapter03;

public class CompareOperator121 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		boolean result1 = (v2 == v3);  //int와 double를 연산 하기 위해선 데이터타입을 동일하게 자동으로 바꿔준다.
		                               //int->double로 변환되어 동일하게 1.0으로 인식.
		
//		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		boolean result2 = (v4 == v5); //false  double와 float 비교시 double로 자동 변환.
		boolean result3 = ((float)v4 == v5); //true
		boolean result4 = (v4 == (double)v5); //flase
//		System.out.println(result2);
//		System.out.println(result3);
//		System.out.println(result4);
		
//		System.out.println(v4 == v5);
//		System.out.println((float)v4 == v5); //true
		
	}

}