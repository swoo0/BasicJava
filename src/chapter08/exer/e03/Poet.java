package chapter08.exer.e03;

public class Poet extends Book {

	public Poet(String title, String author) {
		super(title, author);
	}
	
	@Override
	int getLateFee(int lateDays) {
		return lateDays * 200;
	}
}
