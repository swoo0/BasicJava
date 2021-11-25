package chapter07;

public class ComputerExam {
	public static void main(String[] args) {
		Computer computer = new Computer();
		double area = computer.areaCircle(10);

		System.out.println("원의 넓이: " + area);
		
		double perimeter = computer.perimeterCircle(10);
		System.out.println("원의 둘레: " perimeterCircle);
		
		Calculator2 cal = new Calculator2();
		double area2 = cal.areaCircle(20);
		System.out.println("두번째 원의 넓이: " + area2);
//		cal.perimetor() => 없다
	}
}
