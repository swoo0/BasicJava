package exer.ex06.e2;

public class Time {
	//필드
	private int hour;
	private int minute;
	private int second;
	
	//생성자
	public Time() {
	}
	public Time(int hour, int minute, int second) {
		this.hour = hour > 0 && hour < 24 ? hour : 0;
		this.minute = minute >= 0 && minute < 60 ? minute : 0;
		this.second = second >= 0 && second < 60 ? second : 0;
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

}		
