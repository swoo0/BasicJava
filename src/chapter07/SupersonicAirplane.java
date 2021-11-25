package chapter07;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;
	
	@Override  //부모 클래스의 fly 덮어쓰기 (우선실행)
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();  // Airplane클래스의 fly 실행 
		}
	}
}
