package chapter08.exer.e03;

public class ScienceFiction extends Book {
	//필드
	
	//생성자
	public ScienceFiction(String title, String author) {
		super(title, author);
	}
	
	@Override
	int getLateFee(int lateDays) {
		return lateDays * 600;
	}
}
