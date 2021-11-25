package chapter13;

public class BoxExam {
	public static void main(String[] args) {
		Box box1 = new Box(1);
		Box box2 = new Box("홍길동");
		Box box3 = new Box(true);
		Box box4 = new Box(new Member("홍길동", 20));
		
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
	}
}
