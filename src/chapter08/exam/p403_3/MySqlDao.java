package chapter08.exam.p403_3;

public class MySqlDao implements DateAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}
	@Override
		public void update() {
		System.out.println("MySql DB를 수정");
		}	
	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}
}
