package chapter06.exam.p245_3;

public class BoardExam {
	public static void main(String[] args) {
		Board board1 = new Board("제목", "콘텐츠");
		Board board2 = new Board("제목", "콘텐츠", "작가");
		Board board3 = new Board("제목", "콘텐츠", "작가", "날짜");
		Board board4 = new Board("제목", "콘텐츠", "작가", "날짜", 5);
		
		
		System.out.println(board1.title + ", " + board1.content);
		System.out.println(board2.title + ", " + board2.content + ", " + board2.writer);
		System.out.println(board3.title + ", " + board3.content + ", " + board3.writer + ", " + board3.date + ", " + board3.hitcount);
		System.out.println(board4.title + ", " + board4.content + ", " + board4.writer + ", " + board4.date + ", " + board4.hitcount);
	}
}
