package chapter06;

public class BusExam {
	public static void main(String[] args) {
		Bus myBus = new Bus();
		myBus.keyTurnOn();
		myBus.run();
		int speed = myBus.getSpeed();
		System.out.println("현재속도: " + speed + "km/h");
		
		myBus.setGas(10); //Bus의 setGas() 메소드 호출
		
//		boolean gasState = myBus.isLeftGas();
//		if(gasState) {
//			System.out.println("출발합니다.");
//			myBus.run(); //Bus의 run() 메소드 호출
//		}
		
		if(myBus.isLeftGas()) { //Bus의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
