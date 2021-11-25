package chapter08.exer.e03;

public class Novel extends Book {
	//필드
	
	//생성자
	public Novel(String title, String author) {
		super(title, author);
	}

	@Override
	int getLateFee(int lateDays) {
		return lateDays * 300;
	}
}
