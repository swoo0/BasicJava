package chapter03.exam;

public class Exam03_04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int PenStu = (pencils / students);
		System.out.println(PenStu);
		
		int Penloss = (pencils % students);
		System.out.println(Penloss);
	}
}
