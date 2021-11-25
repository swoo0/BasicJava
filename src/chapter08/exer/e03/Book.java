package chapter08.exer.e03;

import java.util.Objects;

public abstract class Book {
	//필드
	private int number;                    //관리번호
	private String title;                  //책의 제목
	private String author;                 //책의 저자
	private static int countOfBooks;   // 만들어진 Book 객체 개수
									       // 선언과 동시에 0으로 초기화
	
	//생성자
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
		number = ++countOfBooks;
	}
	
	//메소드
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 연체료를 계산하는 추상메소드
	abstract int getLateFee(int lateDays);
	
	
	@Override    // 제목과 저자가 같으면 true를 반환하는 메소드 재정의.
	public int hashCode() {
		return Objects.hash(title, author);
	}
	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();

	}	
	public String toString() {
		return String.format("관리번호 %d번, 제목: %s, 작가: %s(일주일 연체료: %,d원)" , number, title, author, getLateFee(7));
	}
	
}
