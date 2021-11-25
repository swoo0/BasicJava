package chapter06;

public class Member {
	 String name;
	 String id;
	 
	 public Member() {
	 }
	 public Member(String name, String id) {
		 this.name = name;
		 this.id = id;
	 }
	 
	public static void main(String[] args) {
		Member mem1 = new Member();
		Member mem2 = new Member("홍길동", "Hong");
		mem1.name = "최하얀";
		mem1.id = "23";
			
		System.out.println("이름 : " + mem1.name);
		System.out.println("나이 : " + mem1.id);
		System.out.println("이름 : " + mem2.name);
		System.out.println("나이 : " + mem2.id);
			
	}
	
	
}
