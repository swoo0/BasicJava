package exer.ex02;

public class e2 {
	public static void main(String[] args) {
		
		double distance = 40e12;
		double Speed = 300_000;
		
		double time = (distance / Speed) / (double)(60 * 60 * 24 * 365);
		
		System.out.printf("빛의 속도로 센타우리 별까지 가는데 걸리는 시간은 %.15f광년이다", time);
	}
}
