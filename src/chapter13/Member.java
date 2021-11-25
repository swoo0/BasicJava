package chapter13;

import java.util.Objects;

public class Member {
	//필드
	private String name;
	private int age;
	
	//생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override  //name과 age 값이 같으면 동일한 hashCode를 리턴
	public int hashCode() {
		return name.hashCode() + age;
				  //String의 hashCode() 이용
	}

	@Override   //name과 age값이 같으면 true를 리턴
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
		return false;
		}
		
	}			
}
