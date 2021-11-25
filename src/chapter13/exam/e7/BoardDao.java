package chapter13.exam.e7;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {	
	ArrayList<Board> list = new ArrayList<>();

	public BoardDao() {
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
	}

	public List<Board> getBoradList() {
		return list;
	}	

//public class BoardDao {	
//	
//	public List<Board> getBoradList() {
//		ArrayList<Board> list = new ArrayList<Board>();
//		
//		list.add(new Board("제목1", "내용1"));
//		list.add(new Board("제목2", "내용2"));
//		list.add(new Board("제목3", "내용3"));
//		return list;
//		
//	}
}
