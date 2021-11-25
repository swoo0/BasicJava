package chapter13.exam.e7;

import java.util.List;

public class ListExam {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoradList();
		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
