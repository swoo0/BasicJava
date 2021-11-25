package chapter08;
//p377
public class RemoteControlExam {
	public static void main(String[] args) {
		
		RemoteControl rc3 = new Television();
		
		RemoteControl rc1;
		RemoteControl rc2;
		
		rc1 = new Television();
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(3);
		
		rc2 = new Audio();
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(15);
	}
}
