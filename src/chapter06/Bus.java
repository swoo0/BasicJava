package chapter06;

public class Bus {
	int gas;
	int speed;
	
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
		System.out.println("출발합니다.");
	}
	
//	void run() {
//		while()
//		
//		for(int i=10; i<50; i+=10) {
//			speed = i;
//			System.out.println("달립니다.(시속:" + speed + "km/h)");
//		}
//	}

	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;  //false 를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true;//true 를 리턴
	}
	
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량" + gas + ")");
				return; // 메소드 실행 종료
			}
		
			for(int i=10; i<50; i+=10) {
				speed = i;
				System.out.println("달립니다.(시속:" + speed + "km/h)");
			}
		}
	}
}