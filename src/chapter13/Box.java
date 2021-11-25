package chapter13;

// Genenric(제네릭, 지네릭)

public class Box {
	//필드
	private Object value;
	
	//생성자
	public Box(Object value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Box : " + value;
	}
}
